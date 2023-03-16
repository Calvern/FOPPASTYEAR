    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2017;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("First complex number. Enter a number for the real part:");
        a = sc.nextDouble();
        System.out.print("First complex number. Enter a number for the imaginary part:");
        b = sc.nextDouble();
        Complex x = new Complex(a, b);
        System.out.print("Second complex number. Enter a number for the real part:");
        a = sc.nextDouble();
        System.out.print("Second complex number. Enter a number for the imaginary part:");
        b = sc.nextDouble();
        Complex y = new Complex(a, b);
        System.out.println("First complex number:" + x);
        System.out.println("Second complex number:" + y);
        Complex z = x.addComplexNum(y);
        Complex k = x.subtractComplexNum(y);
        System.out.println("Addition of two complex numbers:" + z);
        System.out.println("Subtraction of two complex numbers:" + k);

    }

}
