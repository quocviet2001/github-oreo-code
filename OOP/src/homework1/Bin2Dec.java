package homework1;

import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string : ");
        String inStr = in.next();
        int inStrLen = inStr.length();
        boolean isBinary = true;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (inChar != '0' && inChar != '1') {
                isBinary = false;
            }
        }
        if(isBinary) {
            int results = 0;
            for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
                char inChar = inStr.charAt(charIdx);
                if(inChar == '1')
                    results += (int)Math.pow(2, (inStrLen - 1 - charIdx));
            }
            System.out.println("The equivalent decimal number for binary " + inStr + " is: " + results);
        } else {
            System.out.println("error : invalid binary string " + inStr);
        }
    }
}