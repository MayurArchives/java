import java.io.*;
import java.util.*;

public class print106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int k = 0; k < n - 2 * i; k++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("\t");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
