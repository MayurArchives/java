import java.io.*;
import java.util.*;

public class print52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i >= m; i = i - 3 * k) {

            System.out.print(i + " ");
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}