import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int experience = sc.nextInt();
        int salary= sc.nextInt();
        int rank= sc.nextInt();
        if(experience>=10||salary>=50000||rank>=10){
            System.out.println("You are in top management");
        }else {
            System.out.println("You are not in top management");
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}