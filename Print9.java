import java.io.*;
import java.util.*;

public class Print9 {

    public static void main(Print14[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();
        int age = sc.nextInt();

        if (height == 5 && weight == 50 && age == 10) {
            System.out.println("Overweight");
        } else if (height == 5 || weight == 60) {
            System.out.println("Fat");
        } else if (height == 6 && weight == 50) {
            System.out.println("Slim");
        } else {
            System.out.println("None");
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}