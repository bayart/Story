
/**
    Algorithms, Insertion Sort
    Name: Bayart 
*/

import java.util.Arrays;

public class InsertionSort1 {

    public static void main(String[] args) {

        int[] array = { 24, 13, 26, 1, 12, 27 };
        System.out.println("Original:" + Arrays.toString(array).replace("[", "{").replace("]", "}")); // out original

        for (int j = 1; j < array.length; j++) {
            int[] SortedArr = Arrays.copyOfRange(array, 0, j);
            int[] unsortedArr = Arrays.copyOfRange(array, j, array.length);

            System.out.println("Step " + j + ":" + Arrays.toString(SortedArr).replace("[", "{").replace("]", "}") + " "
                    + Arrays.toString(unsortedArr).replace("[", "{").replace("]", "}")); // steps result

            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
                array[i + 1] = key;
            }
        }
        System.out.println("Step6:" + Arrays.toString(array).replace("[", "{").replace("]", "}")); // out sorted array
    }
}
