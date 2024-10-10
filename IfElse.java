import java.io.*;
import java.util.*;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            if (num > 1000) {
                System.out.println("Even and above 1000");
            } else {
                System.out.println("Even");
            }
        } else {
            if (num > 1000) {
                System.out.println("Odd and above 1000");
            } else {
                System.out.println("Odd");
            }
        }
        sc.close();
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}
