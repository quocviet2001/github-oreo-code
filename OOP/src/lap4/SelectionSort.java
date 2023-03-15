package lap4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i + 1;
            for (int j = i + 2; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
