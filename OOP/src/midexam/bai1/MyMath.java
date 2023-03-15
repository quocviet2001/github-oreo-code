package midexam.bai1;

import java.util.Scanner;

public class MyMath {
    public static double cos(double value) {
        double result = 1;
        final int MAX_INDEX = 100;
        double temp = 1;
        for (int i = 1; i < MAX_INDEX; i++) {
            temp = ((-1) * temp * value * value) / ((2 * i) * (2 * i - 1));
            result += temp;
        }
        return result;
    }

    public static double exp(double x) {
        double exp = 1;
        double temp = 1;
        final int MAX_INDEX = 100;
        for (int i = 1; i < MAX_INDEX; i++) {
            temp = (temp * x) / i;
            exp += temp;
        }
        return exp;
    }

//    public String  decimalTo(String number, int inRadix) {
//        final String HEX_DEC[] = {"0", "1", "2", "3",
//                "4", "5", "6", "7",
//                "8", "9", "A", "B",
//                "C", "D", "E", "F"};
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the decimal number: ");
//
//        String hex = "";
//        while (decNumber > 0) {
//            int results = decNumber % 16;
//            hex = HEX_DEC[results] + hex;
//            decNumber = decNumber / 16;
//        }
//        return
//    }
////
//    public String  toDecimal(String number, int inRadix) {
//
//    }
//
//    public String toRadix(String number, int inRadix, int outRadix) {
//
//    }

    public static void main(String[] args) {
        System.out.println("Gia tri cua bieu thuc (e^2.2) * cos(3.3): " + exp(2.2) * cos(3.3));
    }
}
