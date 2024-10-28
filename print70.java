import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num = 0;
        while (--t >= 0) {
            int n = sc.nextInt();
            num += (int) Math.pow(10, t) * n;
        }
        System.out.print(num);
    }
}