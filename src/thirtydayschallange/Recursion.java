package thirtydayschallange;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(Exponentiation(5,3));

    }

    // Summation(5)  --> 5+4+3+2+1 = 15
    public static int Summation(int n){
        if (n <= 0){
            return 0;
        }else {
            return n + Summation(n-1);
        }
    }

    // Factorial(5) --> 5*4*3*2*1 = 120
    public static int Factorial(int n){
        if (n <= 1){
            return 1;
        }else {
            return n * Factorial(n-1);
        }
    }

    //Exponentiation(5,3) --> 5*5*5 = 125
    public static int Exponentiation(int n, int p){
        if (p <= 0){
            return 1;
        }else {
            return n * Exponentiation(n, p-1);
        }
    }
}
