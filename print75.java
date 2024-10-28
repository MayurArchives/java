import java.util.*;

class Solution {
    public static int gcd(int a, int b) {
        while (a != 0) {
            int rem = b % a;
            b = a;
            a = rem;
        }
        return b;

    }

    public static void main(String[] arg) {
        int a = 3;
        int b = 6;
        System.out.println(gcd(a, b));
    }
}
