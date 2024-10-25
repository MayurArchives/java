import java.io.*;
import java.util.*;

public class print68 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        quotRemi(a, b);

    }

    public static void quotRemi(int a, int b) {
        int quotient = a / b;
        int reminder = a % b;
        System.out.println(quotient + " " + reminder);
    }
}