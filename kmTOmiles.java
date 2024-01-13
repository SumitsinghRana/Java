package Java;
import java.util.Scanner;

public class kmTOmiles {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in); 
        System.out.println("Value in kilometers?");
        int a=s.nextInt();
         float Final=(a/1.609344f);
         System.out.print("in miles is->"+Final);
         s.close();
    }
}
