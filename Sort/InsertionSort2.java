
/**
    Algorithms, Insertion Sort
    Name: Bayart 
  
*/
import java.util.ArrayList;
import java.util.List;

public class InsertionSort2 {

    public static void main(String[] args) {

        int[] A10 = { 100, 200, 50, 30, 40 };
        int[] str = InsertionSort(A10);
        List<Integer> list = new ArrayList<>();

        for (int i : str) {
            list.add(i);
        }
        System.out.println(list);
    }

    public static int[] InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                i = j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
