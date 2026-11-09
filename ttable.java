package loops;
import java.util.Scanner;
public class ttable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int a =sc.nextInt();
        int i=1;
        do{
            System.out.println(a+"x"+i+"="+a*i);
            i++;
        }
        while (i<=10);
        }
    }