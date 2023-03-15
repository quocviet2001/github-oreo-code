package lap2;

import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
            in.close();
        }

        System.out.print("The value are: [");
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print(items[i]);
            } else {
                System.out.print(", " + items[i]);
            }
        }
        System.out.println("]");
    }
}
