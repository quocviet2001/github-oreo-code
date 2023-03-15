package lap3;

import java.util.Scanner;

public class TrigonometricSeries {
    public static double sin(double x, int numTerms) {
        double sin = x;
        double term = x;
        for (int i = 1; i <= numTerms; i++) {
            term = (-1 * (term * x * x)) / ((2 * i + 1) * (2 * i));
            sin += term;
        }
        return sin;
    }

    public static double cos(double x, int numTerms) {
        double cos = 1;
        double term = 1;
        for (int i = 1; i <= numTerms; i++) {
            term = (-1 * (term * x * x)) / ((2 * i) * (2 * i - 1));
            cos += term;
        }
        return cos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter the number terms: ");
        int numTerms = in.nextInt();
        in.close();
        System.out.println("Sin(" + x + ") = " + sin(x, numTerms));
        System.out.println("Cos(" + x + ") = " + cos(x, numTerms));
    }
}
