package loops;

public class ctrrr {
    static void main(String[] args) {
        int ctr =0;
        for (int i=1; i<=5; i++)
            for(int j=1; j<=5; j+=2)
                ++ctr;
        System.out.println(ctr);
    }
}
