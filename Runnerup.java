import java.util.*;

public class Runnerup { // Ensure the class name is Runnerup
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] numbers = { A, B, C };
        Arrays.sort(numbers);

        System.out.println(numbers[1]);
    }
}
