package homework1;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next().toLowerCase();
        int inStrLen = inStr.length();
        int fIdx = 0;
        int dIdx = inStrLen - 1;

        boolean isPalindromicWord = true;
        while (fIdx < dIdx) {
            if (inStr.charAt(fIdx) == inStr.charAt(dIdx)) {
                isPalindromicWord = true;
            }
            else {
                isPalindromicWord = false;
                break;
            }
            fIdx++;
            dIdx--;
        }
        if (isPalindromicWord) {
            System.out.println("'" + inStr + "' is palindrome!");
        }
        else {
            System.out.println("'" + inStr + "' is not palindrome!");
        }
    }
}
