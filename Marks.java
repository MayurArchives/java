import java.io.*;
import java.util.*;

public class Marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks < 33) {
            marks += 4;
        }

        System.out.println(marks);

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}