import java.util.*;

public class bubble_sort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("size of array?");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of your array->");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        arr = sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        s.close();
    }

}
