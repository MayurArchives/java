import java.io.*;
import java.util.*;

public class print61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -100;
        int steps = 0;

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
                steps += 1;

            }

        }
        System.out.println(steps);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}