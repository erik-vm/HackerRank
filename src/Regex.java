import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex{
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}
public class Regex {
    public static void main(String[] args) {

        System.out.println(ipValidChecker(new MyRegex().pattern, "000.12.12.034"));  //valid
        System.out.println(ipValidChecker(new MyRegex().pattern, "000.12.234.23.23")); //invalid
        System.out.println(ipValidChecker(new MyRegex().pattern, "23.45.12.56"));  //valid
        System.out.println(ipValidChecker(new MyRegex().pattern, "23.45.22.32."));   //invalid

    }
    public static boolean ipValidChecker(String enteredIP, String validIPPattern){
        Pattern pattern = Pattern.compile(enteredIP);
        Matcher matcher = pattern.matcher(validIPPattern);
        if (matcher.matches()){
            return true;
        }
        return false;
    }
}
