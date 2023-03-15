package midterm_exam.isort;

public class SelectionSort implements ISort {
    public SelectionSort() {

    }

    @Override
    public int sort(int[] array) {
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
        return 1;
    }
}
