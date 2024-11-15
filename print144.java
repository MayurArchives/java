import java.io.*;
import java.util.*;

public class print144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int week = 1;
        for (int i = 1; i <= n; i++) {
            int ammount = week + (i - 1) % 7;
            total += ammount;
            if (i % 7 == 0) {
                week++;
            }
        }
        System.out.println(total);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}
