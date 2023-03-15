package homework1;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isInt = false;
        int size;
        do {
            System.out.print("Enter the size: ");
            size = in.nextInt();
            if (size >= 0) {
                isInt = true;
            } else {
                System.out.println("Size is a non-negative integer. Please try again!");
            }
        } while (!isInt);
        in.close();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row % 2 == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println(" ");
        }
    }
}
