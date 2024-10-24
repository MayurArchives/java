import java.io.*;
import java.util.*;

public class print65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long fact = 1;
        if (N == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= N; i++) {
                fact *= i;
            }

            System.out.println(fact);

        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}