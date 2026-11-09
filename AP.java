package loops;
import java.util.Scanner;
public class AP {
    static void main(String[] args) {
        // 1 3 5 7 9  2n-1
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for (int i = 1; i<=2*n-1; i++) {
            System.out.println(i);

        }
    }
}
