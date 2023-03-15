
package lap10.ex2_4;

public class ArrayPoly extends AbstractPoly {
    private int[] coefficients;

    public ArrayPoly(int[] coefficients) {
        this.coefficients = coefficients;
    }

    private void reduce() {
        for (int i = this.coefficients.length - 1; i > 0; i--) {
            if (this.coefficients[i] != 0) {
                return;
            } else {
                this.degree = degree - 1;
            }
        }
    }

    @Override
    public Poly derivative() {
        ArrayPoly results = new ArrayPoly(this.differentiate());
        return results;
    }

    public int coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public int[] coefficients() {
        return coefficients;
    }

    public ArrayPoly plus(ArrayPoly another) {
        int maxPow = Math.max(this.degree, another.degree);
        int newCoeffs[] = new int[maxPow];
        if (this.degree == maxPow) {
            newCoeffs = this.coefficients;
        } else {
            newCoeffs = another.coefficients;
        }
        for (int i = 0; i < maxPow; i++) {
            newCoeffs[i] = this.coefficients[i] + another.coefficients[i];
        }
        return new ArrayPoly(newCoeffs);
    }

    public ArrayPoly minus(ArrayPoly another) {
        int maxPow = Math.max(this.degree, another.degree);
        int newCoeffs[] = new int[maxPow];
        if (this.degree == maxPow) {
            newCoeffs = this.coefficients;
        } else {
            newCoeffs = another.coefficients;
        }
        for (int i = 0; i < maxPow; i++) {
            newCoeffs[i] = this.coefficients[i] - another.coefficients[i];
        }
        return new ArrayPoly(newCoeffs);
    }

    public ArrayPoly times(ArrayPoly another) {
        int m = this.coefficients.length;
        int n = another.coefficients.length;
        int array[] = new int[m + n - 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i + j] += this.coefficients[i] * another.coefficients[j];
            }
        }
        return new ArrayPoly(array);
    }

    public String type() {
        return "Array Poly";
    }
}
