package lap2;

public class Print {
    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.println("NULL");
        } else {
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
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 8, 4};
        print(array);
    }
}
