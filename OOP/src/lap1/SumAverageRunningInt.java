package lap1;

public class SumAverageRunningInt {
    public static void main(String []args){
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            number ++;
        }
        average = (double)sum/100;
        System.out.println("The sum of 1 to 100 is: " + sum);
        System.out.println("The average is: " + average);

        // Tổng bình phương từ 1 đến 100
        int sumSquare = 0;
        for (int number1 = LOWERBOUND; number1 <= UPPERBOUND; number1++) {
            sumSquare += number1 * number1;
        }
        System.out.println("The sum of the squares of all number from 1 to 100 is: " + sumSquare);

        // Tổng các số chắn và số lẻ từ 1 đến 100
        int sumOdd = 0;
        int sumEven = 0;
        for (int number1 = LOWERBOUND; number1 <= UPPERBOUND; number1++) {
            if (number1%2 == 1) {
                sumOdd += number1;
            } else {
                sumEven += number1;
            }
        }
        int absDiff;
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }
        System.out.println("The sum of odd number from 1 to 100 is: " + sumOdd);
        System.out.println("The sum of even number from 1 to 100 is: " + sumEven);
        System.out.println("Absolute difference between the two sums is: " + absDiff);
    }
}
