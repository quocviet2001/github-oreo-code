package lap2;

public class ArrayToString {
    public static String arrayToString(int[] array) {
        String str = "[";
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    str += String.valueOf(array[i]);
                } else {
                    str = str + ", " + String.valueOf(array[i]);
                }
            }
            str += "]";
        } else {
            str += "]";
        }
        return str;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 3, 7};
        System.out.println("The array is: ");
        System.out.println(arrayToString(array));
    }
}
