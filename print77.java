import java.io.*;
import java.util.*;

public class print77 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(gcd(x, y));
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static int gcd(int x, int y) {
        while (x != 0) {
            int rem = y % x;
            y = x;
            x = rem;
        }
        return y;
    }
}