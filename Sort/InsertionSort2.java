
/**
    Algorithms, Selection Sort
    Name: Bayart 
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsertionSort2 {
    public static void main(String[] args) {

        int[] sizes = { 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096 };
        for (int n : sizes) {
            System.out.println("Array size: " + n);

            // Already sorted
            int[] sortedArray = createSortedArray(n);
            long timeSorted = measureTime(sortedArray);
            System.out.println("Time for already sorted array: " + timeSorted + " ns");
            // System.out.println("Execution time in milliseconds: " + duration /
            // 1_000_000);

            // Reversely sorted
            int[] reverseSortedArray = createReversedArray(n);
            long timeReverseSorted = measureTime(reverseSortedArray);
            System.out.println("Time for reverse sorted array: " + timeReverseSorted + " ns");

            // Random permutations - 3 permutations
            long totalRandomTime = 0;
            int trials = 3;
            for (int i = 0; i < trials; i++) {
                int[] randomArray = Create_Random_Permute_array(n);
                totalRandomTime += measureTime(randomArray);
            }
            long avgRandomTime = totalRandomTime / trials;
            System.out.println("Average time for random array: " + avgRandomTime + " ns");
            System.out.println();
        }

    }

    public static int[] createSortedArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] createReversedArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
        }
        return array;
    }

    private static int[] Create_Random_Permute_array(int n) {
        Random random = new Random();
        int[] A = createSortedArray(n);
        for (int i = 1; i < n; i++) {
            int min = 1;
            int max = A.length;
            int RandomIndex = random.nextInt(n);
            int temp = A[i];
            A[i] = A[RandomIndex];
            A[RandomIndex] = temp;
        }
        return A;
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    private static long measureTime(int[] array) {
        int[] arrayCopy = array.clone();
        long startTime = System.nanoTime(); // Record the start time
        insertionSort(arrayCopy); // Perform the insertion sort
        long endTime = System.nanoTime(); // Record the end time
        return endTime - startTime; // return calculated execution time
    }

}
