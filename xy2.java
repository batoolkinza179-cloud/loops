package loops;

public class xy2 {
    static void main(String[] args) {
        int x=2, y=50;
        do{
            ++x;
            y-=x++;
        }
        while (x<=10);
        System.out.println(y);

    }
}
