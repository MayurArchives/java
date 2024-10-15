import java.util.Scanner;

public class MarksCalculator {
    public static void main(Print14[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for the five subjects
        double sub1 = sc.nextDouble();
        double sub2 = sc.nextDouble();
        double sub3 = sc.nextDouble();
        double sub4 = sc.nextDouble();
        double sub5 = sc.nextDouble();

        // Calculate the total marks
        double totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;

        // Calculate the percentage (total marks / maximum possible marks * 100)
        double percentage = (totalMarks / 500.0) * 100.0;

        // Output the results
        System.out.println(totalMarks); // Output the total marks
        System.out.println(percentage); // Output the percentage

        sc.close();
    }
}
