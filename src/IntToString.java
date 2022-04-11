import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        String str = n.toString();
        if (str.equals(n.toString())){
            System.out.println("Good job");
        }
    }
}
