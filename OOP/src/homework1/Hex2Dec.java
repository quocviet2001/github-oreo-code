package homework1;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inStr = in.next();
        boolean isHex = true;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')
                    || (inChar >= 'a' && inChar <= 'f'))) {
                isHex = false;
            }
        }
        if (isHex) {
            int results = Integer.parseInt(inStr, 16);
            System.out.println("The equivalent decimal number for hexadecimal '" + inStr + "' is: " + results);
        } else {
            System.out.println("error : invalid hexadecimal string '" + inStr + "'");
        }
    }
}

