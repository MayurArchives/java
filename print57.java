import java.io.*;
import java.util.*;

public class print57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int steps = 0;
        for (int i = n; i >= 1; i /= 2) {

            steps += 1;

        }
        System.out.println(steps);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}