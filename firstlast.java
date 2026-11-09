package loops;
import java.util.Scanner;
public class firstlast {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int s =0;
        int t=n;
        while (n!=0)
        {
            s=(s*10)+(n%10);
            n =n/10;

        }
        int f=s%10;
        int l=t%10;
        System.out.println(t+1);
    }
}
