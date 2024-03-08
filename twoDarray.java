import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("number of rows?");
        int rows = s.nextInt();
        System.out.print("number of colums?");
        int clm = s.nextInt();
        int[][] array = new int[rows][clm];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < clm; j++) {
                array[i][j] = s.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < clm; j++) {
                System.out.print(+array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Element you want to search?");
        int key = s.nextInt();

        int flag = 0;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < clm; j++) {
                if (array[i][j] == key) {
                    System.out.println("Element found at location (" + i + "," + j + ")");
                    flag = 1;
                    break;
                }
            }

        }
        if (flag == 0) {
            System.out.println("Element not found");
        }

        s.close();
    }

}