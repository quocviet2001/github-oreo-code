package homework1;

import java.util.Scanner;

public class TriangularPattern {
    public static void TriangularPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void TriangularPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void TriangularPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void TriangularPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
    public static void main(String []args) {
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
        TriangularPatternA(size);
        TriangularPatternB(size);
        TriangularPatternC(size);
        TriangularPatternD(size);
    }
}
