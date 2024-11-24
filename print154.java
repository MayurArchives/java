import java.io.*;
import java.util.*;

public class print154 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int additiveInverse = -arr1[i];
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (arr2[j] == additiveInverse) {
                    found = true;
                }
            }
            if (found) {
                System.out.print(arr1[i] + " ");
            }
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}