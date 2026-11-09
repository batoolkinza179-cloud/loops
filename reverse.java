package loops;
import java.util.Scanner;
public class reverse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a starting pont of countings: ");
        int b = sc.nextInt();
        for(int i=b; i>=1; i--){
            System.out.println(i);
        }
    }
}
