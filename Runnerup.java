import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Scanner s= new Scanner(System.in);
        // int secondLargest;
        // int A=s.nextInt();//120
        // int B=s.nextInt();//11
        // int C=s.nextInt();//400
        // int secondLargest;

        // if(A>B){
        // if(C>A){
        // secondLargest = A;
        // }
        // }
        // if(B>A){
        // if(C>B){
        // secondLargest = B;
        // }
        // }
        // if(C>A){
        // if(B>C){
        // secondLargest = C;
        // }
        // }
        // if(B>C)
        // System.out.println(secondLargest);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Array banake sort karna
        int[] numbers = { A, B, C };
        Arrays.sort(numbers);

        // Second largest number ko print karna (index 1)
        System.out.println(numbers[1]);

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}