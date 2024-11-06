import java.io.*;
import java.util.*;

public class print107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char charArray[] = new char[n];
        for (int i = 0; i < n; i++) {
            charArray[i] = sc.next().charAt(0);

        }
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (isVowel(charArray[i])) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}