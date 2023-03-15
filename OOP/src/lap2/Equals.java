package lap2;

public class Equals {
    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        } else {
            return false;
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
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 4, 5, 6};
        System.out.println("The array1 is: ");
        print(array1);
        System.out.println("The array2 is: ");
        print(array2);
        System.out.println("array1 equal array2: " + equals(array1, array2));
    }
}
