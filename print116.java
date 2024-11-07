import java.io.*;
import java.util.*;

public class print116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr[i] += 1;
            } else if (arr[i] < 0) {
                arr[i] += 3;
            } else {
                arr[i] += 2;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}