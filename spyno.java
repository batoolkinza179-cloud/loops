package loops;
import java.util.Scanner;
public class spyno {
    static void main(String[] args) {
        int i,n,rem,sum=0,
        prod =1,org;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         org =n;
         while(n>0){
             rem = n%10;
             sum = sum+rem;
             prod = prod*rem;
             n=n/10;

         }
         if(sum==prod){
             System.out.println(org+"is spy no");
         }
         else{
             System.out.println(org+"is not a spy no");
         }
    }
}
