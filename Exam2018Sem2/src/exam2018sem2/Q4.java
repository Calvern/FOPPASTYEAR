/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2018sem2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for a,b,c,d,e and f: ");
        LinearEquatrion a = new LinearEquatrion(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println(a);
        if(a.isSolvable())
            System.out.print("x="+a.computeX()+";y="+a.computeY());
        else
            System.out.println("the equation has no solution");
    }
}
