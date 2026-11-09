package loops;
import java.util.Scanner;
public class facctorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter th number : ");
        int a = sc.nextInt();
        int fact=1;
        if(a==0 || a==1){
            System.out.println("factorial: 1");

        }
        else {
            for(int i=1; i<=a; i++){
                fact*=i;
            }
            System.out.println("factorial :"+fact);
        }
    }
}
