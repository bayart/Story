import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        int[] A = { 100, 200, 50, 30, 40, 64, 25, 12, 22, 11 };
        int[] str = SelectionSort(A);
        List<Integer> list = new ArrayList<>();
        for (int i : str) {
            list.add(i);
        }
        System.out.println(list);
    }

    public static int[] SelectionSort(int[] array) {
        int step = 1;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;
            // swap
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.println(step + "th Step :");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
            step++;
        }
        return array;
    }

}