package homework1;

import java.util.Scanner;

public class HillPattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isInt = false;
        int numRows;
        do {
            System.out.print("Enter the rows: ");
            numRows = in.nextInt();
            if (numRows > 0) {
                isInt = true;
            } else {
                System.out.println("rows is a non-negative integer. Please try again!");
            }
        } while (!isInt);

        System.out.println("HillPatternA :");
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= (2 * numRows - 1); col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("HillPatternB :");
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= (2 * numRows - 1); col++) {
                if ((row + col <= numRows * 2) && (0 <=  col - row)) {
                    System.out.print("# ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("HillPatternC :");
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= (2 * numRows - 1); col++) {
                if ((row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("# ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int row = 2; row <= numRows; row++) {
            for (int col = 1; col <= (2 * numRows - 1); col++) {
                if ((row + col <= numRows * 2) && (0 <=  col - row)) {
                    System.out.print("# ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("HillPatternD: ");
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= (2 * numRows - 1); col++) {
                if ((row + col >= numRows + 2) && (row >= col - numRows + 2)) {
                    System.out.print("  ");
                } else
                    System.out.print("# ");
            }
            System.out.println();
        }
        for (int row = 2; row <= numRows; row++) {
            for (int col = 1; col <= (2 * numRows - 1); col++) {
                if ((row + col <= numRows * 2 - 1) && (1 <=  col - row)) {
                    System.out.print("  ");
                } else
                    System.out.print("# ");
            }
            System.out.println();
        }
    }
}
