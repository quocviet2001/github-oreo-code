package midexam.bai2;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < data.length; j++)
                if (data[j] < data[min_idx])
                    min_idx = j;
            int temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
        return 0;
    }
}
