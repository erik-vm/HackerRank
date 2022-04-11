import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {

        /*There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.*/

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        int numA = (int) A.charAt(0);
        int numB = (int) B.charAt(0);

        if (numA > numB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.toUpperCase().charAt(0) + A.substring(1, A.length()).concat(" " + B.toUpperCase().charAt(0) + B.substring(1, B.length())));
    }
}
