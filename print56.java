import java.io.*;
import java.util.*;

public class print56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 0;
        while (n > 0) {
            n = n / 10;
            // System.out.print(n);
            c++;

        }
        System.out.print(c);

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}