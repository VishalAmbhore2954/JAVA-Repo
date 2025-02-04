import java.util.Scanner;
import java.util.*;

public class HackerRank1 {

    static int power(int x, int y) {
        int val = 1;
        for (int i = 0; i < y; i++) {
            val = val * x;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("term");
        int term = sc.nextInt();
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt();

        int val = 0;
        for (int i = 0; i < term; i++) {
            if (i == 0) {
                val = a + (power(2, i) * b);
            } else {
                val = val + (power(2, i) * b);
            }
            System.out.print(val + " ");
        }
    }
}
