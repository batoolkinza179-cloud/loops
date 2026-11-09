package loops;
import java.util.Scanner;
public class perfectno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while (i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==n){
            System.out.println("perfect no");
        }else {
            System.out.println("not perfect numbr");
        }
    }
}
