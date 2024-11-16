import java.io.*;
import java.util.*;

public class print146 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                break;
            } else {
                arr[i] = 0;
            }
        }
        if (arr[0] == 0) {
            System.out.print("1 ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}