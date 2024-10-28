import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int sets = a;
        if (b / 2 < sets) {
            sets = b / 2;
        }
        if (c / 4 < sets) {
            sets = c / 4;
        }
        int fruits= sets*7; 
        System.out.println(fruits);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}