
import java.util.*;

public class insertion_sort {
    public static int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;

        }

        return array;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("size?");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array->");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        arr = sort(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        s.close();
    }

}
