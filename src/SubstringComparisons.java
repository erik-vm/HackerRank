import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringComparisons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        String[] subs;
        if (s.length() - k -1  > 0) {
             subs = new String[s.length() - k - 1];
        }else {
            subs = new String[s.length()];
        }
        String smallest = "";
        String largest = "";

        SortedSet<String> sets = new TreeSet<>();
        for (int i = 0;i<= s.length()-k; i++){
            sets.add(s.substring(i,i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }

}
