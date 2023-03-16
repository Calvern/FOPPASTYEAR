/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2017;

/**
 *
 * @author user
 */
public class Complex {

    double a, b;

    public Complex() {

    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public Complex addComplexNum(Complex x) {
        double o = a + x.a;
        double p = b + x.b;
        return new Complex(o, p);

    }

    public Complex subtractComplexNum(Complex x) {
        double o = a - x.a;
        double p = b - x.b;
        return new Complex(o, p);

    }

    @Override
    public String toString() {
        return "(" + a + "+" + b + "i)";
    }

}
