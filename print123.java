import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (arr2[j] == arr1[i]) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(arr1[i] + " ");
            }
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}