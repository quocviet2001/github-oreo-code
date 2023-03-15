package lap5.ex1_7;

import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = in.nextDouble();
        double imag1 = in.nextDouble();
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real2 = in.nextDouble();
        double imag2 = in.nextDouble();
        in.close();
        System.out.println(" ");

        MyComplex complex1 = new MyComplex(real1, imag1);
        MyComplex complex2 = new MyComplex(real2, imag2);
        System.out.println("Number 1 is: " + complex1);
        printIsRealAndImaginary(complex1);
        System.out.println(" ");
        System.out.println("Number 2 is: " + complex2);
        printIsRealAndImaginary(complex2);
        System.out.println(" ");

        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equal to " + complex2);
        } else {
            System.out.println(complex1 + " is NOT equal to " + complex2);
        }

        System.out.println(complex1 + " + " + complex2 + " = " + complex1.addNew(complex2));
        System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtractNew(complex2));
        System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiply(complex2));
        System.out.println(complex1 + " / " + complex2 + " = " + complex1.divide(complex2));
        System.out.println("Conjugate of number 1 is: " + complex1.conjugate());
    }

    public static void printIsRealAndImaginary(MyComplex complex) {
        if (complex.isReal()) {
            System.out.println(complex + " is a pure real number.");
        } else {
            System.out.println(complex + " is NOT a pure real number.");
        }
        if (complex.isImaginary()) {
            System.out.println(complex + " is a pure imaginary number.");
        } else {
            System.out.println(complex + " is NOT a pure imaginary number.");
        }
    }
}