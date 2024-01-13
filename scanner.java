package Java;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = scanner.nextLine();
        System.out.print("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("In which course are you in?");
        String course = scanner.nextLine();
        System.out.print(" In which section are you?");
        String section = scanner.nextLine();
        System.out.println("What is your class roll number?");
        int roll = scanner.nextInt();
        scanner.close();
        System.out.println("Hellow:" + name);
        System.out.println("Your age is:" + age);
        System.out.println("You are parsuing" + " " + course + " " + "Your section is:" + section + " "
                + " And your roll number is:" + roll);

    }

}
