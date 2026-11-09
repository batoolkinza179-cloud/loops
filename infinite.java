package loops;

public class infinite {
    static void main(String[] args) {
   /*  int   x=1,y=1;
     while (x<=y){
         y=y/x;
         System.out.println(y);
     }*/
        int x=1, y=1;
        do {
         y=y/x;
            System.out.println(y);
       //    break;

        }
        while (x<=y);

    }
}
