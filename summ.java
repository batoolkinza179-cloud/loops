package loops;
import java.util.Scanner;
public class summ {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the end point:");
        int a =sc.nextInt();
        int i=0;
        int sum=0;
        do{
            sum+=i;
            i++;
        }
        while (i<=a);
        System.out.println("sum:"+sum);

    }
}
