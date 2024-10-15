import java.io.*;
import java.util.*;

public class Product {

     public static void main(Print14[] args) {
          Scanner sc = new Scanner(System.in);
          int product1 = sc.nextInt();
          int product2 = sc.nextInt();
          int product3 = sc.nextInt();
          int product4 = sc.nextInt();
          int product = product1 * product2 * product3 * product4;
          if (product > 1000) {
               System.out.println(true);
          } else {
               System.out.println(false);
          }

          /*
           * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
           * class should be named Solution.
           */
     }
}