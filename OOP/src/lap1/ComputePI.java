package lap1;

public class ComputePI {
    public static void main(String []args) {
        double sum = 0.0;
        int maxDenominator = 1000;
        for ( int denominator = 1 ; denominator <= maxDenominator; denominator += 2 ) {
            if (denominator % 4 == 1) {
                sum += (double)1/denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double)1/denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        System.out.println("The value of the PI number is: " + 4 * sum);
    }
}

// with maxDenominator=1000, the PI value is 3.13959265589785
// with maxDenominator=1000, the PI value is 3.141392653591791
// --> The higher the maxDenominator, the bigger the PI.
