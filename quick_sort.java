import java.util.*;

public class quick_sort {

    public static int placement(int[] arr, int high, int low) {

        int i = low - 1;
        int pivet = arr[high];

        for (int j = low; j < high; j++) {

            if (arr[j] < pivet) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }

    public static void quickSort(int[] arr, int high, int low) {
        if (low < high) {
            int pindex = placement(arr, high, low);

            quickSort(arr, high, pindex +1);
            quickSort(arr, pindex - 1, low);

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size ? ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements->");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        quickSort(arr, size - 1, 0);

        System.out.println("elements after sort->");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

        s.close();
    }

}
