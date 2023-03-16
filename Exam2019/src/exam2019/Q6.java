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
public class Q6 {
    public static void main(String[] args) {
        Order a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name=sc.nextLine();
        System.out.print("Enter customer id:");
        String ID =sc.next();
        System.out.print("Enter quantity ordered :");
        int quantity=sc.nextInt();
        System.out.print("Enter price per unit :");
        double priceperunit=sc.nextDouble();
        sc.nextLine();
        a=new Order(name,ID,quantity,priceperunit);
        System.out.println(a.toString());
        ShippedOrder ship;
        System.out.print("Enter customer name: ");
         name=sc.nextLine();
        System.out.print("Enter customer id:");
         ID =sc.next();
        System.out.print("Enter quantity ordered :");
        quantity=sc.nextInt();
        System.out.print("Enter price per unit :");
         priceperunit=sc.nextDouble();
        ship = new ShippedOrder(name,ID,quantity,priceperunit);
        System.out.println(ship.toString());
        
        
        
        
    }
}

   
    
       
      
        
        
        
    
