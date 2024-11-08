import java.io.*;
import java.util.*;

public class print120 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int val = sc.nextInt();
        int k = removeElement(num, val);

        System.out.println(k);

    }

    public static int removeElement(int[] num, int val) {
        int k = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[k] = num[i];
                k++;
            }
        }

        return k;
    }
}
