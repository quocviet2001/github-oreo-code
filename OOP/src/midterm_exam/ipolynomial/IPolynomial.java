package midterm_exam.ipolynomial;

public interface IPolynomial {
    double coefficient(int value);

    double[] coefficients();

    int degree();

    IPolynomial derivative();

    double evaluate(double value);

    IPolynomial integral();
}
