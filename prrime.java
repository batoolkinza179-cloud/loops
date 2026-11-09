package loops;
import  java.util.Scanner;

public class prrime {
    static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int b = sc.nextInt();
        int i=2;
        boolean isprime = true;
        while (i<b){
            if(b%i==0){
                isprime =false;
                break;

            }
            i++;
        }
        if(isprime){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
