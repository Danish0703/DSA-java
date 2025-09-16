

class Complex {

    int real;
    int imaginary;

    // Constructor
    public Complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    // Addition
    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imaginary + b.imaginary));
    }

    // Subtraction
    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imaginary - b.imaginary));
    }

    // Printing Complex Number
    public void printComplex() {
        if (real == 0 && imaginary != 0) {
            System.out.println(imaginary + "i");
        } else if (real != 0 && imaginary == 0) {
            System.out.println(real);
        } else if (real == 0 && imaginary == 0) {
            System.out.println("0");
        } else {
            System.out.println(real + (imaginary > 0 ? "+" : "") + imaginary + "i");
        }
    }
}

class Solution {

    public static void main(String[] args) {
        Complex c = new Complex(1, 2);
        Complex d = new Complex(3, 4);

        Complex added = Complex.add(c, d);
        Complex differ = Complex.diff(c, d);

        added.printComplex();
        differ.printComplex();
    }
}
