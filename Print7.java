import java.io.*;
import java.util.*;

public class Solution {

    public static void main(Print14[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A':
                System.out.println("Excellent!");
                break;

            case 'B':
                System.out.println("Well done!");
                break;

            case 'C':
                System.out.println("You passed!");
                break;

            case 'F':
                System.out.println("Better luck next time!");
                break;

            default:
                System.out.println("Invalid grade");
                break;
        }
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}