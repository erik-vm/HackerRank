package thirtydayschallange;

import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int reminder = 0, temp = 0, result = 0;

        while (N > 0) {
            reminder = N % 2;
            N /= 2;
            if (reminder == 1) {
                temp++;
                if (temp >= result)
                    result = temp;
            } else {
                temp = 0;
            }
        }
        System.out.println(result);
    }

}
