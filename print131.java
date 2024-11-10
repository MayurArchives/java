import java.util.Scanner;

public class print131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Arrays to store left and right products
        int[] left = new int[n];
        int[] right = new int[n];

        // Fill the left array
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        // Fill the right array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        // Calculate the result by multiplying left and right arrays
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        // Print the result array
        for (int res : result) {
            System.out.println(res);
        }
    }
}
