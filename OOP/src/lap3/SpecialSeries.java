package lap3;

import java.util.Scanner;

public class SpecialSeries {
    public static double specialSeries(double x, int numberTerms) {
        double sum = x;
        for (int i = 1; i < numberTerms; i++) {
            double temp = Math.pow(x, 2 * i + 1) / (double) (2 * i + 1);
            for (int j = 2 * i - 1; j > 0; j -= 2) {
                temp *= j / (double) (j + 1);
            }
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");  // -1 < x < 1
        int x = in.nextInt();
        System.out.println("Enter the number term: ");
        int numTerms = in.nextInt();
        in.close();
        System.out.println("Special Series is: " + specialSeries(x, numTerms));
    }
}
