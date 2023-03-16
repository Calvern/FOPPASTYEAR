/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2016sem2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pound,kilogram;
        System.out.print("Enter the number in pounds: ");
        pound=sc.nextDouble();
        kilogram=pound*0.454;
        System.out.println(pound+" pounds is "+kilogram+" kilograms");
    }
    
}
