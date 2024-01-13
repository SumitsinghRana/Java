
import java.util.Scanner;

public  class another {
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

