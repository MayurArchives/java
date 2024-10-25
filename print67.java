import java.io.*;
import java.util.*;

public class print67 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = prodNumber(x, y);
            System.out.println(result);
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static int prodNumber(int x, int y) {
        return Integer.parseInt(x + "" + y);

    }
}