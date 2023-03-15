package midterm_exam.my_math;

public class MyMath {

    public MyMath() {

    }

    public static double cos(double value) {
        double result = 1;
        final int MAX_INDEX = 100;
        double temp = 1;
        for (int i = 1; i < MAX_INDEX; i++) {
            temp = ((-1) * temp * value * value) / ((2 * i) * (2 * i - 1));
            result += temp;
        }
        return result;
    }

    public static double sin(double value) {
        double result = value;
        double temp = value;
        final int MAX_INDEX = 100;
        for (int i = 1; i < MAX_INDEX; i++) {
            temp = ((-1) * temp * value * value) / ((2 * i + 1) * (2 * i));
            result += temp;
        }
        return result;
    }

    public static double exp(double x) {
        double exp = 1;
        double temp = 1;
        final int MAX_INDEX = 100;
        for (int i = 1; i < MAX_INDEX; i++) {
            temp = (temp * x) / i;
            exp += temp;
        }
        return exp;
    }

    public static double ln(double value) {
        double x = value - 1;
        double ln = x;
        double temp = x;
        final int MAX_INDEX = 100;
        for (int i = 1; i < MAX_INDEX; i++) {
            temp = ((-1) * temp * x * i) / (i + 1);
            ln += temp;
        }
        return ln;
    }

    public static void main(String[] args) {
        System.out.println("Giá trị của biểu thức ln(3.5) * exp^2.2 + sin(1.7) + cos(3.1): " +
                (ln(3.5) * exp(2.2) + sin(1.7) + cos(3.1)));
    }
}
