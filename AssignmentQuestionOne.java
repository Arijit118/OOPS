package OOPSTutorial;

import java.util.Scanner;
import OOPSTutorial.*;

public class AssignmentQuestionOne {
    public static void main(String args[]) {
        /*
         * Print the sum,difference and product of two complex numbers by creating a
         * class named'
         * Complex'with separate methods for each operation whose real and imaginary
         * parts are
         * entered by the user
         */
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real * b.real), (a.imag * b.imag));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}
