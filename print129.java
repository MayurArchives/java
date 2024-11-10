import java.util.Scanner;

public class print129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read the elements of the nums array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Array to store the answer
        int[] result = new int[n];

        // Brute-force approach to calculate counts
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        // Print the result array
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
