package midexam.bai2;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
        return 0;
    }
}
