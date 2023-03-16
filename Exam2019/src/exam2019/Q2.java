/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2019;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double PRICEPERKILO=5.99;
        final double TAX=0.0725;
        double totalprice,totalpricewithtax;
        
        System.out.print("Enter the number of bags sold: ");
        int bag=sc.nextInt();
        System.out.print("Enter the weight per bag (kilogram): ");
        double weight =sc.nextDouble();
        System.out.println("Price per kilogram:  $"+PRICEPERKILO);
        System.out.printf("Sales tax:          %.2f%%%n",(TAX*100));
        totalprice=weight*bag*PRICEPERKILO;
        totalpricewithtax=totalprice+totalprice*TAX;
        System.out.printf("Total price:       $%.2f",totalpricewithtax);
        
    }
    
}
