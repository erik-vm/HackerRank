import java.util.Scanner;

public class StaticInitializerBlock {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int H = scanner.nextInt();
        if (B < 1 || H < 1){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(B*H);
        }
    }
}
