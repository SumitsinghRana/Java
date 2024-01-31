import java.util.Scanner;

public class fibonacci {
    public static int fibonacciFunction(int n) {
        if (n == 0) {
            return 0;

        } else if (n == 1) {

            return 1;
        } else {
            return fibonacciFunction(n - 1) + fibonacciFunction(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number->");
        int val = s.nextInt();
        System.out.println(fibonacciFunction(val));
        s.close();
    }

}
