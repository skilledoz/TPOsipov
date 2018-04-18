import java.util.*;

public class TP1{
    public static int vvod(String[] n){
        System.out.println("Введите число, до которого будут отбираться простые числа:");
        Scanner in = new Scanner(System.in);
        int an = in.nextInt();
        return an;
    }

    public static void validation(int i, int y){
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                y = 0;
                break;
            }
        }
        if (y == 1)
        System.out.println("" + i);
    }

    public static void main(String[] args) {
        int f = vvod(args);
        for (int i = 2; i < f; i++) {
            int y = 1;
            validation(i,y);
        }
    }
}
