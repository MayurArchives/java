import java.io.*;
import java.util.*;

public class print60 {

    public static void main(String[] args) {
        for (int i = 122; i >= 97; i--) {
            char x = (char) i;
            if (i % 2 == 0) {
                System.out.print(x + " ");
            } else {
                System.out.print(Character.toUpperCase(x) + " ");
            }
        }

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}