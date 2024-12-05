import java.io.*;
import java.util.*;

public class print160 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int n = sc.nextInt();

        // Input the nums array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create the ans array
        int[] ans = new int[2 * n];

        // Fill the ans array with two concatenated copies of nums
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i]; // First half
            ans[i + n] = nums[i]; // Second half
        }

        // Print the ans array
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}