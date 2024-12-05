import java.util.Scanner;

public class print161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the size of the pattern

        // Loop through rows
        for (int i = 1; i <= n; i++) {
            // Determine starting value for the row
            int start = (i % 2 == 0) ? 0 : 1;

            // Print the row
            for (int j = 0; j < i; j++) {
                System.out.print((start + j) % 2 + " "); // Alternate between 0 and 1
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
