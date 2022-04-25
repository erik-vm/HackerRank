import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        while (testCases>0){
            ValidUserNameChecker(scanner.nextLine());
            testCases--;
        }
        scanner.close();
    }
    public static void ValidUserNameChecker(String username){
        String usernameConditions = "^[aA-zZ]\\w{7,29}$";
        Pattern validUsername = Pattern.compile(usernameConditions);
        Matcher validationChecker = validUsername.matcher(username);
        if (validationChecker.matches()){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
