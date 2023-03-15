package homework1;

import java.util.Scanner;

public class SquarePattern {
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
                System.out.print("# ");
            }
            System.out.println(" ");
        }
        System.out.println("While - do :");
        tryWhileDo(size);
    }

    // Using while-do loop:
    static void tryWhileDo(int size) {
        int count = 1;
        while (count <= size) {
            int count1 = 1;
            while (count1 <= size) {
                System.out.print("# ");
                count1++;
            }
            count++;
            System.out.println(" ");
        }
    }
}
