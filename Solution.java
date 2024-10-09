// import java.util.*;

// public class Sum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int sum = x + y;
//         int difference = x - y;
//         System.out.println(sum);
//         System.out.println(difference);
//         sc.close();

//     }
// }
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int Salary = sc.nextInt();

        double bonus = 0.0;

        if (t > 5) {
            bonus = Salary * 0.05; // Use userSalary instead of Salary
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("Bonus: 0");
        }
    }

    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
}
