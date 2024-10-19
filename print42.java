import java.io.*;
import java.util.*;

public class print42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nPr = 1;
        for (int i = n; i > (n - r); i--) {
            nPr *= i;
        }
        System.out.println(nPr);

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}