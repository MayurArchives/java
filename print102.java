import java.io.*;
import java.util.*;

public class print102 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int firstIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                firstIndex = i;
                break;
            }
        }
        System.out.print(firstIndex + " ");

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}