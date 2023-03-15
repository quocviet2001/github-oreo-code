package lap5.ex1_7;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        if (this.imag >= 0) {
            return "(" + this.real + " + " + this.imag + ")";
        } else {
            return "(" + this.real + " - " + Math.abs(this.imag) + "i)";
        }
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(real, imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.real;
        double newImag = this.imag + right.imag;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex add(MyComplex right) {
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
        return this;
    }

    public MyComplex subtract(MyComplex right) {
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        double newReal = this.real - right.real;
        double newImag = this.imag - right.imag;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex multiply(MyComplex right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex divide(MyComplex right) {
        double denominator = Math.pow(right.real, 2) + Math.pow(right.imag, 2);
        double newReal = (this.real * right.real + this.imag * right.imag) / (denominator);
        double newImag = (this.imag * right.real - this.real * right.imag) / (denominator);
        return new MyComplex(newReal, newImag);
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -1 * imag);
    }
}
