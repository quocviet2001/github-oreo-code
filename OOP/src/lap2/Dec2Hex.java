package lap2;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        final String HEX_DEC[] = {"0", "1", "2", "3",
                "4", "5", "6", "7",
                "8", "9", "A", "B",
                "C", "D", "E", "F"};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decNumber = in.nextInt();
        String hex = "";
        while (decNumber > 0) {
            int results = decNumber % 16;
            hex = HEX_DEC[results] + hex;
            decNumber = decNumber / 16;
        }
        System.out.println("The equivalent hexadecimal number is " + hex);
    }
}
