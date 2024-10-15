import java.util.*;

public class pattern2 {

    public static void main(Print14[] arg) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
