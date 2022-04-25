package thirtydayschallange;

import java.util.Collections;
import java.util.Scanner;

public class Arrays {

    //this app take in elements, buts them in array and prints them out in reverse


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testcases = scanner.nextInt();
        int[] array = new int[testcases];
        for (int i = 0; i < testcases; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = testcases; i > 0; i--) {
            System.out.print(array[i-1] + " ");
        }

    }
}
