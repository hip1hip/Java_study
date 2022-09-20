//166p 문제6번 개발자 홍인표

class Complex {
    double real, imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(double real) {
        this(real, 0.0);
    }

    public String print() {
        return real + " + " + imag + "i";
    }

}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        System.out.println(c1.print());
        Complex c2 = new Complex(1.5, 2.5);
        System.out.println(c2.print());
    }
}
