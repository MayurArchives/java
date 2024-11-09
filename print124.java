import java.io.*;
import java.util.*;

public class print124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read the size of the array
        int arr[] = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        // Print the results
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}
