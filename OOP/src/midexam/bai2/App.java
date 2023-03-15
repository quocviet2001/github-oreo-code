package midexam.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class App {
    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        return array;
    }

    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.println("NULL");
        } else {
            System.out.print("[");
            if (array.length == 0)
                System.out.println("]");
            else {
                for (int i = 0; i < array.length; i++) {
                    if (i == 0)
                        System.out.print(array[i]);
                    else
                        System.out.print(", " + array[i]);
                }
                System.out.println("]");
            }
        }
    }


    public static void main(String[] args) {
        int[] array1 = createRandomArray(9);
        print(array1);
        int[] array2 = createRandomArray(6);
        print(array2);
        int[] array3 = createRandomArray(7);
        print(array3);
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Using Bubble Sort Algorithm: ");
        System.out.println("Before sorting: ");
        print(array1);
        System.out.println("After sorting: ");
        bubbleSort.sort(array1);
        print(array1);
        System.out.println(" ");

        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Using Selection Sort Algorithm: ");
        System.out.println("Before sorting: ");
        print(array2);
        System.out.println("After sorting: ");
        selectionSort.sort(array2);
        print(array2);
        System.out.println(" ");

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Using Insertion Sort Algorithm: ");
        System.out.println("Before sorting: ");
        print(array3);
        System.out.println("After sorting: ");
        selectionSort.sort(array3);
        print(array3);
        // Number of swap: 10
        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
    }
}
