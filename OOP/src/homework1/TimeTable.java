package homework1;

import java.util.Scanner;

public class TimeTable {
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
        in.close();

        System.out.print(" * |");
        for (int number = 1; number <= size; number++) {
            System.out.printf("%4d", number);
        }
        System.out.println(" ");
        System.out.print("----");
        for (int number = 1; number <= size; number++) {
            System.out.print("----");
        }
        System.out.println(" ");
        for (int firNumber = 1; firNumber <= size; firNumber++) {
            if (firNumber / 10 == 1) {
                System.out.print(firNumber + " |");
            } else {
                System.out.print(" " + firNumber + " |");
            }
            for (int secNumber = 1; secNumber <= size; secNumber++) {
                int result = firNumber * secNumber;
                System.out.printf("%4d", result);
            }
            System.out.println(" ");
        }
    }
}
