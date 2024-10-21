import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int steps = 0;

            while (n > 0) {
                if (n % 2 == 0) {
                    n -= 1;
                } else {
                    n -= 3;
                }
                steps++;
            }
            System.out.println(steps);

            /*
             * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
             * class should be named Solution.
             */
        }
    }
}