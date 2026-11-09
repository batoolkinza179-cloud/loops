package loops;
import java.util.Scanner;
public class GCD {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter two numbers : ");
        int a =sc.nextInt();
        int b = sc.nextInt();
        int gcd =0;
        int i=1;
        int lcm;
        while (i<a && i<=b ){
            if(a%i==0 && b%i==0){
                gcd=i;

            }
            i++;
        }
        System.out.println("GCD:"+gcd);
        lcm=(a*b)/gcd;
        System.out.println("lcm:"+lcm);

    }
}
