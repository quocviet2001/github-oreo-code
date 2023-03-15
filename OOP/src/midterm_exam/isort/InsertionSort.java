package midterm_exam.isort;

public class InsertionSort implements ISort {
    public InsertionSort() {

    }

    public int sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return 1;
    }
}
