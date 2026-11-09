package loops;
import java.util.Scanner;
public class armstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        int sum = 0;
        int rem;
        int temp = n;
        while (n != 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;

        }
        if (sum == temp) {
            System.out.println("aremstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
