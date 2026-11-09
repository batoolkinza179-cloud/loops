package loops;
import java.util.Scanner;
public class checkprime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, f=0;

        for (  i = 2; i <n ; i++) {
            if(n%i==0)
            {
                f=1;
                break;
            }

        }
        if(f==0)
            System.out.println("the number is prime ");
        else
            System.out.println("the no is not prime");
    }
}
