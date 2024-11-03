import java.io.*;
import java.util.*;

public class print95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int odd = i % 2;
            for (int j = 0; j < i; j++) {
                System.out.print(odd + " ");
                odd = 1 - odd;
            }

            System.out.println();
        }
    }

}