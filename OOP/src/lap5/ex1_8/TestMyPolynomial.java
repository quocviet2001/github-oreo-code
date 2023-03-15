package lap5.ex1_8;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial poly1 = new MyPolynomial(1.0, 2.0, 3.0, 4.0);
        System.out.println("Poly1: " + poly1);
        System.out.println("Degree is: " + poly1.getDegree());
        System.out.println("Evaluate: " + poly1.evaluate(1));

        MyPolynomial poly2 = new MyPolynomial(1.0, 1.0, 1.0);
        System.out.println("Poly2: " + poly2);
        System.out.println("Degree is: " + poly2.getDegree());
        System.out.println("Evaluate: " + poly2.evaluate(2));

        System.out.println("Poly1 add poly2 is: " + poly1.add(poly2));
        System.out.println("Poly1 multiply poly2 is: " + poly1.multiply(poly2));
    }
}
