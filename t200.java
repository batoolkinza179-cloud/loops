package loops;

public class t200 {
    static void main(String[] args) {
        int i,n=5, s=0;
        double f =0;
        for (i=n; i>0; i--){
            s=i*i;
            f=(Math.pow(s,2))-i;
            System.out.println(f);

        }
    }
}
