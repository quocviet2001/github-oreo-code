package lap5.ex1_8;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.getDegree() - 1; i >= 0; i--) {
            description.append(this.coeffs[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        description.delete(description.length() - 3, description.length());
        return description.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.getDegree() - 1; i >= 0; i--) {
            polyValue = polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolyData = new double[maxDegree];
        for (int i = 0; i <= this.getDegree() - 1; i++) {
            addPolyData[i] += this.coeffs[i];
        }

        for (int i = 0; i <= right.getDegree() - 1; i++) {
            addPolyData[i] += right.coeffs[i];
        }

        MyPolynomial addPoly = new MyPolynomial(addPolyData);
        return addPoly;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int multiPolyDegree = this.getDegree() + right.getDegree();
        double[] multiPolyData = new double[multiPolyDegree];
        for (int i = 0; i <= this.getDegree() - 1; i++) {
            for (int j = 0; j <= right.getDegree() - 1; j++) {
                multiPolyData[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        MyPolynomial multiPoly = new MyPolynomial(multiPolyData);
        return multiPoly;
    }
}
