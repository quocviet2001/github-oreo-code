package homework6.ex1_1;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("123456789876543212345679876543212345678987654312345677887210");
        BigInteger i2 = new BigInteger("999999999999999999999999999999999999999999999999999999999999999999");
        System.out.println("Sum of two Big Integers: " + i1.add(i2));
        System.out.println("Multiply of two Big Integers: " + i1.multiply(i2));
    }
}
