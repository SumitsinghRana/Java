package Java;
import java.util.Scanner;

public class percentage {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        //int[] arr=new int[5];
        System.out.println("Write marks of student in 5 subjects->");
        int a1=s.nextInt();
        int a2=s.nextInt();
        int a3=s.nextInt();
        int a4=s.nextInt();
        int a5=s.nextInt();

        float per;
        per=(a1+a2+a3+a4+a5)/5.0f; 
        System.out.print("percentage of the students is ->"+per);
        s.close();
      

    }
}
