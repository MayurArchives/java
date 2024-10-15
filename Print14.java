import java.io.*;
import java.util.*;

public class Print14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.length() > s2.length()) {
            String res = s2 + s1 + s2;
            System.out.println(res);
        } else {
            String res = s1 + s2 + s1;
            System.out.println(res);
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}