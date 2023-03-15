package homework1;

import java.util.Scanner;

public class BoxPattern {
    static void BoxPatternA(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || col == 1 || col == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    static void BoxPatternB(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    static void BoxPatternC(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || row + col == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    static void BoxPatternD(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col < size; col++) {
                if (row == 1 || row == size - 1 || row + col == size || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isInt = false;
        int size;
        do {
            System.out.print("Enter the size: ");
            size = in.nextInt();
            if (size > 0) {
                isInt = true;
            } else {
                System.out.println("Size is a non-negative integer. Please try again!");
            }
        } while (!isInt);
        BoxPatternA(size);
        BoxPatternB(size);
        BoxPatternC(size);
        BoxPatternD(size);
    }
}
