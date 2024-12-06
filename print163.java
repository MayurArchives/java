import java.io.*;
import java.util.*;

public class print163 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.print("*");

            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}