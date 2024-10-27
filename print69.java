// Online Java Compiler
import java.io.*;
import java.util.*;

public class print69 {
    public static long fact ( int  n){
            long prod = 1;
            for ( int i = 1 ; i <= n ; i++)
                    prod*=i;
            return prod;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int r = sc.nextInt();
            if ( r > n){
                    System.out.print("0");
                    return ; 
            }
            System.out.print(fact(n)/ ( fact (r) * fact(n-r)));
}
}