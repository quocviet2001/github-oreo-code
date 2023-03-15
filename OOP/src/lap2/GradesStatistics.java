package lap2;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        final int numStudents = in.nextInt();
        int[] grade = new int[numStudents];
        if (grade.length > 0) {
            for (int i = 0; i < grade.length; i++) {
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grade[i] = in.nextInt();
            }
        }
        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        double average = sum / grade.length;
        System.out.printf("The average is: %.2f%n", average);

        int min = grade[0];
        for (int i = 1; i < grade.length; i++) {
            if (grade[i] < min) {
                min = grade[i];
            }
        }
        System.out.println("The minimum is: " + min);

        int max = grade[0];
        for (int i = 1; i < grade.length; i++) {
            if (grade[i] > max) {
                max = grade[i];
            }
        }
        System.out.println("The maximum is: " + max);
    }
}
