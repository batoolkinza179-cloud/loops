package loops;

public class datacount {
    static void main(String[] args) {
        int datacount=1;
        while (datacount<=6){
            if(datacount%2==2)
                System.out.println("first set");
            else if(datacount%3==0)
                System.out.println("second set");
            else
                System.out.println("third set");
            datacount++;
        }
    }
}
