package midterm_exam.ipolynomial;

import OOPExercises.OOPExercises.collections.exercises.polynomials.Poly;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    public ListPolynomial(double[] coefficients) {
        this.coefficients = new ArrayList<Double>();
        for (double c : coefficients) {
            this.coefficients.add(c);
        }
    }

    public double coefficient(int value) {
        return this.coefficients.get(value);
    }

    public double[] coefficients() {
        double[] coefficient = new double[coefficients.size()];
        for (int i = 0; i < coefficient.length; i++) {
            coefficient[i] = coefficients.get(i);
        }
        return coefficient;
    }

    public IPolynomial derivative() {
        return new ListPolynomial(differentiate());
    }

    public IPolynomial integral() {
        return new ListPolynomial(integrate());
    }

    public ListPolynomial minus(ListPolynomial other) {
        double[] result = new double[Math.max(coefficients.size(), other.coefficients.size())];
        if (coefficients.size() >= other.coefficients.size()) {
            for (int i = other.coefficients.size() - 1; i >= 0; i--) {
                result[i] = coefficients.get(i) - other.coefficients.get(i);
            }
            for (int i = coefficients.size() - 1; i > other.coefficients.get(i); i--) {
                result[i] = coefficients.get(i);
            }
        }

        if (coefficients.size() < other.coefficients.size()) {
            for (int i = coefficients.size() - 1; i >= 0; i--) {
                result[i] = coefficients.get(i) - other.coefficients.get(i);
            }
            for (int i = other.coefficients.size() - 1; i > coefficients.get(i); i--) {
                result[i] = (-1) * other.coefficients.get(i);
            }
        }
        return new ListPolynomial(result);
    }

    public ListPolynomial plus(ListPolynomial other) {
        return null;
    }

    private void reduce() {
        for (int i = coefficients.size() - 1; i > 0; i--) {
            if (coefficients.get(i) != 0) {
                return;
            } else {
                this.degree = degree - 1;
            }
        }
    }

//    public ListPolynomial times(ListPolynomial other) {
//
//    }

    public String type() {
        return "List Poly";
    }
}
