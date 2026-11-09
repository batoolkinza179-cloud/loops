package loops;

public class dryrun {
    static void main(String[] args) {
        int x =1, i=2;
        do
            {
                x*=i;
        }while (++i<=5);
        System.out.println(x);
    }
}
