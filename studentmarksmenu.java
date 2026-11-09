package loops;
import java.util.*;

public class studentmarksmenu {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int input;

        do {
            System.out.println("Enter 1 to continue or 0 to stop:");
            input = sc.nextInt();

            if(input == 1) {

                System.out.print("Enter marks (out of 100): ");
                int marks = sc.nextInt();

                if(marks >= 90) {
                    System.out.println("Good");
                }
                else if(marks >= 60 && marks <= 89) {
                    System.out.println("This is also good");
                }
                else if(marks >= 0 && marks <= 59) {
                    System.out.println("This is good as well");
                }
                else {
                    System.out.println("Invalid Marks");
                }
            }

        } while(input != 0);

        System.out.println("Program Ended");
    }
}