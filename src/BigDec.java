import java.math.BigDecimal;
import java.util.*;

public class BigDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        ArrayList<BigDecimal> decimalArrayList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            String dec = scanner.nextLine();
            BigDecimal bigDecimal = new BigDecimal(dec);
            decimalArrayList.add(bigDecimal);
        }
        Collections.sort(decimalArrayList, Collections.reverseOrder());

        for (int i = 0; i< decimalArrayList.size(); i++){
            System.out.println(decimalArrayList.get(i));
    }
    }
}

