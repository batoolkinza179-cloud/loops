package loops;
import java.util.Scanner;
public class fionnaciseries {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println(a+"\n"+b);
        for(int i=0; i<n-2; i++){
            System.out.println(c);
            a =b;
            b=c;
            c =a+b;
        }
    }
}
