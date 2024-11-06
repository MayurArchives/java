import java.util.Scanner;

public class print109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int i = n - 1; i >= 0; i--) {
            char ch = arr[i];
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
