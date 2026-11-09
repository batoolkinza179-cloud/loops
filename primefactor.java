package loops;
import java.util.Scanner;
public class primefactor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();
        int i=2;
        while (i<a){
            while (a%i==0){
                System.out.println(i);
                a=a/i;

            }
            i++;
        }
        if(a>2){
            System.out.println(a);
        }
    }
}
