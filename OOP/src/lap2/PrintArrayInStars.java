package lap2;

import java.io.Console;
import java.util.Scanner;

public class PrintArrayInStars {
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
        }
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int starNum = 1; starNum <= items[i]; starNum++) {
                System.out.print("*");
            }
            System.out.println("(" + items[i] + ")");
        }
    }
}
