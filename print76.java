import java.io.*;
import java.util.*;

public class print76 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            if (checkingPrime(number)) {
                System.out.println("prime");

            } else {
                System.out.println("not prime");
            }
        }

    }

    static boolean checkingPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

}
