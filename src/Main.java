import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int myInt = scan.nextInt();
        double myDouble = scan.nextDouble();
        scan.nextLine();
        String myStr = scan.nextLine();

        System.out.println(i+myInt);
        System.out.println(d+myDouble);
        System.out.println(s+myStr);
    }
}
