import java.util.*;

public class selection_sort {

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[small] > array[j]) {
                    small = j;

                }
            }

            int temp = array[small];
            array[small] = array[i];
            array[i] = temp;

        }

        return array;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Size of array?");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of your array->");
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
