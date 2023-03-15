package lap1;

public class HarmonicSum {
    public static void main(String []args) {
        final int  MAXDENOMINATOR = 50000;
        double sumLR = 0.0;
        double sumRL = 0.0;
        double absDifferent;
        for ( int denominator = 1; denominator <= MAXDENOMINATOR; denominator++) {
            double fraction = (double) 1/denominator;
            sumLR += fraction;
        }
        System.out.println("The sum from left to right is: " + sumLR);
        for ( int denominator = 50000; denominator >= 1; denominator --) {
            double fraction =(double) 1/denominator;
            sumRL += denominator;
        }
        System.out.println("The sum from right to left is: " + sumRL);
        if (sumLR > sumRL) {
            absDifferent = sumLR - sumRL;
        }
        else {
            absDifferent = sumRL - sumLR;
        }
        System.out.println("The absolute difference between the two sums is: " + absDifferent);
    }
}
