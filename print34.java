import java.io.*;
import java.util.*;

public class print34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }

            /*
             * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
             * class should be named Solution.
             */
        }
    }
}