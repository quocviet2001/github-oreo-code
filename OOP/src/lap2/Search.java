package lap2;

public class Search {
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
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
        int key = 5;
        int[] array = {1, 2, 4, 5, 7};
        System.out.println("The key is: " + key);
        System.out.println("The array is: ");
        print(array);
        System.out.println("The position of the key in the array is: " + search(array, key));
    }
}
