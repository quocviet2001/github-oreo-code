
package lap10.ex2_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListPoly extends AbstractPoly {

    private List<Integer> coefficients;

    public ListPoly(int[] coefficients) {
        this.coefficients = IntStream.of(coefficients).boxed().collect(Collectors.toList());
    }

    public int coefficient(int i) {
        return coefficients.get(i);
    }

    public int[] coefficients() {
        int[] coeffs = new int[coefficients.size()];
        for (int i = 0; i < coeffs.length; i++) {
            coeffs[i] = coefficients.get(i);
        }
        return coeffs;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(this.differentiate());
    }

    public String type() {
        return "List Poly";
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
}
