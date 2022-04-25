import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger intA = new BigInteger(a);
        BigInteger intB = new BigInteger(b);

        System.out.println(intA.add(intB));
        System.out.println(intA.multiply(intB));
    }
}
