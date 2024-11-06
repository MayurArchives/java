import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (isComposite(array[i])) {
                // System.out.println(array[i]);
                System.out.println(array[i]);
            }
        }
    }

    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;

    }

}
