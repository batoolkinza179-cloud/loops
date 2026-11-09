package loops;
import java.util.Scanner;
public class perfectnumber {
    static void main(String[] args) {
        int i,n ,sum=0;
        Scanner sc = new Scanner(System.in);
         n =sc.nextInt();


        for ( i = 1; i <n ; i++) {
            if(n%i==0)

        sum+=i;

        }
        if(sum==n){
            System.out.println(n+"it is perfect number");
        }
        else {
            System.out.println(n+"it is not perfect number");
        }
    }
}
