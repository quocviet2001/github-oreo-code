
package lap10.ex2_4;

public interface Poly {
    public abstract int coefficient(int a);

    public abstract int[] coefficients();

    public abstract int degree();

    public abstract Poly derivative();

    public abstract double evalueate(double b);
}
