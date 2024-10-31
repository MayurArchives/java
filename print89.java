import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isArmstrong(int number) {
        int original = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (original != 0) {
            int rem = original % 10;
            result += power(rem, n);
            original /= 10;

        }
        return result == number;
    }

    public static int power(int base, int expo) {
        int result = 1;
        for (int i = 1; i <= expo; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}