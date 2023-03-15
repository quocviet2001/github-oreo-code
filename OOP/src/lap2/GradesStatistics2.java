package lap2;

import java.util.Scanner;
import java.util.Arrays;

public class GradesStatistics2 {
    public static int[] grades;

    public static void readGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        final int numStudents = in.nextInt();
        grades = new int[numStudents];
        if (grades.length > 0) {
            for (int i = 0; i < grades.length; i++) {
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grades[i] = in.nextInt();
            }
        }
        in.close();
    }

    public static void print(int[] array) {
        System.out.print("[");
        if (array.length == 0)
            System.out.println("]");
        else {
            for (int i = 0; i < array.length; i++) {
                if (i == 0)
                    System.out.print(array[i]);
                else
                    System.out.print(", " + array[i]);
            }
            System.out.println("]");
        }
    }

    public static double averageGrades(int[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }

    public static double medianGrades(int[] array) {
        int lenArray = array.length;
        Arrays.sort(array);
        if ((lenArray % 2) != 0) {
            return array[lenArray / 2];
        } else {
            return (array[lenArray / 2] + array[(lenArray / 2) - 1]) / 2;
        }
    }

    public static int maxGrades(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minGrades(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double mean = averageGrades(array);
        double stdDev = 0;
        for (int i = 0; i < array.length; i++) {
            stdDev += Math.pow((array[i] - mean), 2);
        }
        stdDev = (Math.round(stdDev / array.length) * 100) / 100;
        return Math.sqrt(stdDev);
    }

    public static void main(String[] args) {
        readGrades();
        System.out.println("The grades are: ");
        print(grades);
        System.out.println("The average is: " + averageGrades(grades));
        System.out.println("The medan is: " + medianGrades(grades));
        System.out.println("The maximum is: " + maxGrades(grades));
        System.out.println("The minimum is: " + minGrades(grades));
        System.out.println("The standard deviation is: " + stdDev(grades));
    }
}
