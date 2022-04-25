package thirtydayschallange;

import java.util.Arrays;
import java.util.Scanner;

class Difference{
    int[] elements;
    int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }
    void computeDifference(){
        Arrays.sort(elements);
        int min = elements[0];
        int max = elements[elements.length-1];
        maximumDifference = max - min;
    }
}

public class Scope {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
