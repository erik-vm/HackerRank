import java.util.Scanner;

public class ConditionalStatements {

    /* Task
Given an integer N perform the following conditional actions:

If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5 , print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether N  is weird or not.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N%2!=0){
            System.out.println("Weird");
        }else if(N%2 == 0 && (N>1&&N<6)){
            System.out.println("Not Weird");
        }else if(N%2 == 0 && (N>5&&N<21)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}
