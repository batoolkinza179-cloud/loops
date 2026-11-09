package loops;

public class pattern {
    static void main(String[] args) {
     /*   int i,j;
        for ( i = 5; i >=1 ; i--) {
            for ( j = 1; j <=5 ; j++)

                System.out.print(i);
            System.out.println();

        }*/
        int i=5,j;
        do{
            j=1;
            do{
                System.out.print(i);
                j++;
            }
            while (j<=5);
            System.out.println();
            i--;
        }
        while (i>=1);
    }
}
