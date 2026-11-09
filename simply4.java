package loops;

public class simply4 {
    static void main(String[] args) {
        int x = 0;
        while (x++<20){
            if(x%2==0)
                System.out.println("simply");
            else if (x==9)
            break;
            else
            continue;


        }
    }
}