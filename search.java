import java.util.*;

public class search {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of your array->");
        int n = s.nextInt();
        int[] array = new int[n];
        System.out.println("Input values in array->");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Which value U want to search?");
        int value = s.nextInt();
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                System.out.print(+value + " is in " + i + "th index");
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Not found");
        }

        s.close();
    }
}
