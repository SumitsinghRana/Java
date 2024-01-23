import java.util.Scanner;

public class checkLegal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age->");
        int age = s.nextInt();
        if (age >= 18) {
            System.out.println("You are Elligible for Voting.");

        } else {

            System.out.println("You are Under age.");
        }

        s.close();

    }
}
