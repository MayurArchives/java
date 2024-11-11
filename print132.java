import java.io.*;
import java.util.*;

public class print132 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
