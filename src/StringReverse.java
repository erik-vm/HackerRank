import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String str = "";
        char chr;
        for(int i = 0; i<A.length(); i++){
            chr = A.charAt(i);
            str = chr+str;
        }
        System.out.println(str);
        if(A.equals(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
