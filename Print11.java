import java.io.*;
import java.util.*;

public class Print11 {

    public static void main(Print14[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'M' || ch == 'm') {
            System.out.println("You are a male");
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("You are a female");
        } else {
            System.out.println("Type again");
        }
    }
}