package lap4;

public class RecursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIndex, int toIndex) {
        int middleIndex = (fromIndex + toIndex) / 2;
        if (fromIndex > toIndex) {
            return false;
        }
        if (array[middleIndex] == key) {
            return true;
        }
        if (array[middleIndex] > key) {
            return binarySearch(array, key, fromIndex, middleIndex - 1);
        }
        return binarySearch(array, key, middleIndex + 1, toIndex);
    }

    public static boolean binarySearch(int[] arrray, int key) {
        return binarySearch(arrray, key, 0, arrray.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        System.out.println(binarySearch(array, 11));
        System.out.println(binarySearch(array, 16));
        System.out.println(binarySearch(array, 25));
        System.out.println(binarySearch(array, 455));
    }
}
