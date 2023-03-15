package lap2;

public class Swap {
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
        }
        return true;
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
        int[] array1 = {1, 2, 3, 6, 8, 9};
        int[] array2 = {6, 4, 9, 7, 5, 2};
        System.out.println("The array 1: ");
        print(array1);
        System.out.println("The array 2: ");
        print(array2);
        if (swap(array1, array2)) {
            System.out.println("The array1 after swap: ");
            print(array1);
            System.out.println("The array2 after swap: ");
            print(array2);
        } else {
            System.out.println("Two arrays not of the same length!");
        }
    }
}
