import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        scanner.close();

        str = str.trim();
        if(str.length() == 0){
            System.out.println(0);
        }else {
            String[] array = str.split("['!?,._@ ]+");
            System.out.println(array.length);
            for (String s : array){
                System.out.println(s);
            }
        }
    }
}
