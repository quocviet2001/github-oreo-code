package homework1;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next().toLowerCase();
        int inStrLen = inStr.length();
        int numVowels = 0;
        int numDigits = 0;
        for (int index = 0; index < inStrLen; index++) {
            char ingChar = inStr.charAt(index);
            if (ingChar == 'a' || ingChar == 'e' || ingChar == 'i' || ingChar == 'o' || ingChar == 'u') {
                numVowels += 1;
            }
            if (Character.isDigit(ingChar)) {
                numDigits += 1;
            }
        }
        double percentageVowels = ((double)(numVowels) / (double)(inStrLen)) * 100;
        double percentageDigits = ((double)(numDigits) / (double)(inStrLen)) * 100;
        System.out.printf("Number of vowels: %d (%.2f%%)\n", numVowels, percentageVowels);
        System.out.printf("Number of digits: %d (%.2f%%)\n", numDigits, percentageDigits);
    }
}
