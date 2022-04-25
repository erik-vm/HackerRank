package thirtydayschallange;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {

        //this app prints out chars in string, depending on their index is odd or even

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[testCases + 1];

        for (int i = 0; i < testCases; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < testCases; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(array[i].charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < array[i].length(); j++) {
                if (j % 2 != 0) {
                    System.out.print(array[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}

