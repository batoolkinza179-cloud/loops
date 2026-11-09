package loops;
import java.util.Scanner;
public class strong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        int sum=0;
        int rem;
        int temp=n;
        while (n!=0){
            rem =n%10;
            int i=1;
            int fact=1;
            while (i<=rem){
                fact*=i;
                i++;

            }
            sum+=fact;
            n=n/10;

        }
        if(sum==temp){
            System.out.println("strong number");
        }
        else {
            System.out.println("not strong number ");
        }
    }
}
