package lap3;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        System.out.println("Key in your guess: ");
        int number = in.nextInt();
        int count = 0;
        while (number != SECRET_NUMBER) {
            if (number > SECRET_NUMBER) {
                System.out.println("Try lower: ");
                number = in.nextInt();
                count++;
            } else {
                System.out.println("Try higher: ");
                number = in.nextInt();
                count++;
            }
        }
        in.close();
        System.out.println("You got it in int " + count + " trials!");
    }
}
