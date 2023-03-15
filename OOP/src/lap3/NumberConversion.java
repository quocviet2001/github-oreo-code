package lap3;

import java.util.Scanner;

public class NumberConversion {
    public static String toRadix(String in, int inRadix, int outRadix) {
        int count = Integer.parseInt(in, inRadix);
        if (outRadix == 16) {
            String result = Integer.toHexString(count);
            return result;
        }
        if (outRadix == 10) {
            String result = String.valueOf(count);
            return result;
        }
        if (outRadix == 2) {
            String result = Integer.toBinaryString(count);
            return result;
        }
        String result = Integer.toOctalString(count);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String inStr = in.nextLine();
        System.out.print("Enter the input radix: ");
        int inRadix = in.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = in.nextInt();
        in.close();
        if (outRadix == 8 || outRadix == 10 || outRadix == 16 || outRadix == 2) {
            System.out.println("'" + inStr + "'" + "in radix " + inRadix + " is " + toRadix(inStr, inRadix, outRadix) + " in radix " + outRadix);
        } else {
            System.out.println("Error!!!");
        }
    }
}
