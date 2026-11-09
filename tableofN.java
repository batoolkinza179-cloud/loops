package loops;
import java.util.Scanner;
public class tableofN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an integer:");
        int n = sc.nextInt();
        // ye 100 times chally ga
      //  for (int i = n; i<=n*10;i++) {
       //     if(i%n==0)
        // ye 10 times chally ga
        for (int i = n; i <=n*10; i+=n) {



                System.out.println(i);

        }
    }

}
