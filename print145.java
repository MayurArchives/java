import java.util.Scanner;

public class print145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
}