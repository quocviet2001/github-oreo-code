package lap1;
import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1 = in.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = in.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = in.nextInt();
        System.out.print("Enter 4rd integer: ");
        int number4 = in.nextInt();
        System.out.print("Enter 5rd integer: ");
        int number5 = in.nextInt();
        in.close();
        int sum3;
        int product3;
        int min3;
        int max3;
        sum3 = number1 + number2 + number3;
        product3 = number1 * number2 * number3;

        min3 = number1;
        if (number2 < min3) {
            min3 = number2;
        }
        if (number3 < min3) {
            min3 = number3;
        }

        max3 = number1;
        if (number2 > max3) {
            max3 = number2;
        }
        if (number3 > max3) {
            max3 = number3;
        }

        System.out.println("The sum3 is: " + sum3);
        System.out.println("The product3 is: " + product3);
        System.out.println("The min3 is " + min3);
        System.out.println("The max3 is " + max3);

        // SumProductMinMax5:
        int sum5;
        int product5;
        int min5;
        int max5;
        sum5 = number1 + number2 + number3 + number4 + number5;
        product5 = number1 * number2 * number3 * number4 * number5;

        min5 = number1;
        if (number2 < min5) {
            min5 = number2;
        }
        if (number3 < min5) {
            min5 = number3;
        }
        if (number4 < min5) {
            min5 = number4;
        }
        if (number5 < min5) {
            min5 = number5;
        }

        max5 = number1;
        if (number2 > max5) {
            max5 = number2;
        }
        if (number3 > max5) {
            max5 = number3;
        }
        if (number4 > max5) {
            max5 = number4;
        }
        if (number5 > max5) {
            max5 = number5;
        }

        System.out.println("The sum5 is: " + sum5);
        System.out.println("The product5 is: " + product5);
        System.out.println("The min5 is " + min5);
        System.out.println("The max5 is " + max5);
    }
}
