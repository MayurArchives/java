import java.io.*;
import java.util.*;

public class print46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
            if (i % 2 == 0) {
                System.out.print(c + " ");
            }
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}