import java.io.*;
import java.util.*;

public class Print12 {

    public static void main(Print14[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int r = sc.nextInt();

        if (m < 20 || r > 100) {
            System.out.println("Needs improvement");
        } else if (m < 40 || r > 80) {
            System.out.println("Concentrate");
        } else if (m < 60 || r > 120) {
            System.out.println("Needs to focus");
        } else if (m > 100 || r < 10) {
            System.out.println("Very good");
        } else {
            System.out.println("Bright Student");
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}