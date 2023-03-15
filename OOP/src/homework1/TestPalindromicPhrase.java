package homework1;

import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String inStr = in.nextLine();
        int inStrLen = inStr.length();
        String checkStr = "";
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            if (Character.isLetter(inStr.charAt(charIdx))) {
                checkStr += inStr.charAt(charIdx);
            }
        }
        checkStr = checkStr.toLowerCase();
        int fIdx = 0;
        int bIdx = checkStr.length() - 1;
        boolean isPalindromicPhrase = true;
        while (fIdx < bIdx) {
            if (checkStr.charAt(fIdx) == checkStr.charAt(bIdx)) {
                isPalindromicPhrase = true;
            } else {
                isPalindromicPhrase = false;
                break;
            }
            fIdx++;
            bIdx--;
        }

        if (isPalindromicPhrase) {
            System.out.println("'" + inStr + "' is palindrome");
        } else {
            System.out.println("'" + inStr + "' is not palindrome");
        }
    }
}
