package lap1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String []args) {
        final int NUM_STUDENTS = 3;
        int numberIn;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            boolean isValid = false;
            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                numberIn = in.nextInt();
                if (numberIn >= 0 && numberIn <=100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;
        }
        double average = (double)sum/NUM_STUDENTS;
        System.out.println("The average is: " + average);
    }
}
