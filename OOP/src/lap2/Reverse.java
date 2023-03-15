package lap2;

public class Reverse {
    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
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
        int[] array = {5, 2, 7, 6, 4, 1};
        System.out.println("The array is: ");
        print(array);
        reverse(array);
        System.out.println("The reverse array is: ");
        print(array);
    }
}
