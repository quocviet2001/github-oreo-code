package lap2;

public class CopyOf {
    public static int[] copyOf(int[] array, int newLength) {
        int[] copy = new int[newLength];
        if (array.length >= newLength) {
            for (int i = 0; i < newLength; i++) {
                copy[i] = array[i];
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }
            for (int i = array.length; i < newLength; i++) {
                copy[i] = 0;
            }
        }
        return copy;
    }

    public static void print(int[] array) {

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

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7};
        System.out.println("The array is: ");
        print(array);
        int newLength = 6;
        System.out.println("The new length of copy array is: " + newLength);
        int[] copy = copyOf(array, newLength);
        System.out.println("The copy array is: ");
        print(copy);
    }
}
