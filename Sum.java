package Java;
import java.util.Scanner;

public  class Sum {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);  
        System.out.println("Enter first number->");
        int a=s.nextInt();
        System.out.println("Enter secound number->");
        int b=s.nextInt();
        System.out.print("Sum of "+a+" and "+b+" is->"+(a+b));
        s.close();
    }
}
/*package Java;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Write the value of a->");
        a = s.nextInt();
        System.out.println("Write the value of b->");
        b = s.nextInt();
        System.out.println("Write the value of c->");
        int c = s.nextInt();
        System.out.print("The sum of three numbers is->" + (a + b + c));

        s.close();
    }

}
*/