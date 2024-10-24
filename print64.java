
import java.io.*;
import java.util.*;

public class print64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read input

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = 1; i <= n - 1; i++) {
            // Print spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}{

}
