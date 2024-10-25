import java.io.*;
import java.util.*;

public class even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            even(x, y);
        }

    }

    public static void even(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
