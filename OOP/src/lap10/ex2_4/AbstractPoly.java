package lap10.ex2_4;

import java.util.*;

public abstract class AbstractPoly implements Poly {

    protected int degree;

    public AbstractPoly() {
    }

    public AbstractPoly(int degree) {
        this.degree = degree;
    }

    @Override
    public int degree() {
        return this.degree;
    }

    public int[] differentiate() {
        int[] results = new int[this.coefficients().length - 1];
        for (int i = 0; i < this.coefficients().length - 1; i++) {
            results[i] = coefficient(i + 1) * (i + 1);
        }
        return results;
    }

    @Override
    public boolean equals(Object o) {
        if (Objects.isNull(o) || Objects.isNull(this)) {
            return false;
        }
        if (((AbstractPoly) o).degree != this.degree) {
            return false;
        }
        if (((AbstractPoly) o).coefficients() != this.coefficients()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        int coeffs[] = this.coefficients();
        String out = "" + coeffs[0];
        for (int i = 1; i < coeffs.length; i++) {
            out += " + " + coeffs[i] + "x^" + i;
        }
        return out;
    }

    @Override
    public double evalueate(double x) {
        int coeffs[] = this.coefficients();
        double sum = coeffs[coeffs.length - 1];
        for (int i = coeffs.length - 2; i > 0; i--) {
            sum = sum * x + coeffs[i];
        }
        return sum;
    }
}
