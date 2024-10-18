import java.io.*;
import java.util.*;

public class print33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i /= 3) {

            System.out.print(i + " ");
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}