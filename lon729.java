package loops;

public class lon729 {
    static void main(String[] args) {
        long num =729, sum=0;
        for (long y =num; y>0; y=y/10){
            sum =sum +y%10;

        }
        System.out.println("sum of digits is:"+sum);
    }
}
