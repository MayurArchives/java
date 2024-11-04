import java.io.*;
import java.util.*;

public class print97 {

    public static void main(String[] args) {
        int arr[] = { 10, 27, 3, 5 };
        int min = arr[0];
        for (int i = 0; i > arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }
}