import java.io.*;
import java.util.*;

public class totalSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();
        char grade = sc.next().charAt(0);
        int totalSalary = totalsalary(basicSalary, grade);

        System.out.println(totalSalary);
    }

    public static double hra(int basicSalary) {
        return 0.20 * basicSalary;
    }

    public static double da(int basicSalary) {
        return 0.50 * basicSalary;
    }

    public static double allow(char grade) {
        switch (grade) {
            case 'A':
                return 1700;
            case 'B':
                return 1500;
            default:
                return 1300;
        }
    }

    public static double pf(int basicSalary) {
        return 0.11 * basicSalary;
    }

    public static int totalsalary(int basicSalary, char grade) {
        double hra = hra(basicSalary);
        double da = da(basicSalary);
        double allow = allow(grade);
        double pf = pf(basicSalary);

        double total = basicSalary + hra + da + allow - pf;
        return (int) Math.round(total);

    }

}