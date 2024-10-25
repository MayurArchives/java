import java.util.Scanner;

public class AverageCalculator {
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double average = calculateAverage(num1, num2, num3);
        System.out.println(average);

    }

}
