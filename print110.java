import java.io.*;
import java.util.*;

public class print110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstMax = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > firstMax) {
                firstMax = arr[i];
            }
        }
        int secondMax = -2147483648;
        for (int i = 0; i < n; i++) {
            if (arr[i] != firstMax && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

}