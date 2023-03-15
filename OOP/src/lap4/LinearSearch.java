package lap4;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 56, 78, 90, 1, 6};
        System.out.println(linearSearch(array, 56));
        System.out.println(linearSearch(array, 32));
        System.out.println(linearSearchIndex(array, 1));
        System.out.println(linearSearchIndex(array, 54));
    }
}
