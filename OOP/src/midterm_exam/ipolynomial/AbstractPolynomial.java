package midterm_exam.ipolynomial;

import homework6.ex1_5.SouthAmericaCountry;

public abstract class AbstractPolynomial implements IPolynomial {
    protected int degree;

    public AbstractPolynomial() {
        this.degree = 0;
    }

    public int degree() {
        return this.degree;
    }

    public double[] differentiate() {
        double[] result = new double[Math.max(1, degree())];
        for (int i = 0; i < degree(); i++) {
            result[i] = coefficient(i + 1) * (i + 1);
        }
        return result;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof IPolynomial p)) {
            return false;
        }

        if (((IPolynomial) o).degree() != p.degree()) {
            return false;
        }

        for (int i = 0; i <= degree(); i++) {
            if (((IPolynomial) o).coefficient(i) != p.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    public double evaluate(double x) {
        double coefficient[] = this.coefficients();
        double result = coefficient[coefficient.length - 1];
        for (int i = coefficient.length - 1; i >= 0; i--) {
            result = result * x + coefficient[i];
        }
        return result;
    }

    public double[] integrate() {
        double coefficient[] = new double[this.degree() + 1];
        for (int i = degree() + 1; i > 0; i--) {
            coefficient[i] = coefficient(i - 1) / (i - 1);
        }
        return coefficient;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < degree(); i++) {
            sb.append(coefficient(i)).append("x^").append(i).append(" + ");
        }
        sb.append(coefficient(degree())).append("x^").append(degree());
        return sb.toString();
    }
}
