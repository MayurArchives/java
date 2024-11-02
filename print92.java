import java.util.Scanner;

public class print92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number as a string
        String number = scanner.nextLine();

        // kitne digit h count hoge
        System.out.println(number.length());

        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.println(number.charAt(i));
        }

        scanner.close();
    }
}
