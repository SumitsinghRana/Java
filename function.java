import java.util.Scanner;

public class function {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input first value->");
        int a = s.nextInt();
        System.out.print("Input second value->");
        int b = s.nextInt();
        int ans = sum(a, b);
        System.out.print("sum of " + a + " and " + b + " is " + ans);
        s.close();
    }
}
