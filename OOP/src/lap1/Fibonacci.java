package lap1;

public class Fibonacci {
    public static void main(String []args) {
        int nMax = 20;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int sum = 0;
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are: " );
        for (int i = 1; i <= nMax; i++) {
            System.out.print(fnMinus1 + " ");
            fn = fnMinus1 + fnMinus2;
            sum += fnMinus1;
            fnMinus1 = fnMinus2;
            fnMinus2 = fn;
        }
        System.out.println(" ");
        average = (double) sum/nMax;
        System.out.println("The average is: " + average);
    }
}
