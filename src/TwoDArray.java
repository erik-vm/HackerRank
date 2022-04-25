import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TwoDArray {

    /*there will be six lines, each containing six integers. each int will be between -9 and 9 inclusive
      task is to get the sum on bigger hourglass

         a b c
           d              <<<===== hourglass
         e f g

      sample input :
      1 1 1 0 0 0
      0 1 0 0 0 0
      1 1 1 0 0 0
      0 0 2 4 4 0
      0 0 0 2 0 0
      0 0 1 2 4 0

      output : 19    its sums upp 2+4+4+2+1+2+4
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxValue = Integer.MIN_VALUE;

        //create and populate an array

        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        //get the highest value

        for (int i = 0; i < array.length-2; i++) {
            int tempSum = 0;
            for (int j = 0; j < array[i].length-2; j++) {
                tempSum = array[i][j] + array[i][j + 1] + array[i][j+2] + array[i+1][j + 1] + array[i+2][j] + array[i + 2][j+1] + array[i + 2][j + 2];
                if (tempSum > maxValue) {
                    maxValue = tempSum;
                }
            }
        }
        System.out.println(maxValue);
    }
}
