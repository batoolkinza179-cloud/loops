package loops;
import java.util.Scanner;
public class sumofdigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();
        int sum=0;
        int rem;
        while (a!=0){
            rem = a %10;
            sum+=rem;
            a=a/10;

        }
        System.out.println("sum of digits:"+sum);
    }
}
