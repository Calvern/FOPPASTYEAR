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
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuadraticEquation x;
        System.out.print("Enter the values for a,b and c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        x=new QuadraticEquation(a,b,c);
        System.out.println("The equation is : "+x.getA()+"x(^2)+ "+x.getB()+"x + ("+x.getC()+")");
        System.out.println("Discriminant: "+x.Discriminant());
        if(x.Discriminant()>0)
            System.out.println("The roots : "+x.calcRoot1()+" and "+x.calcRoot2());
        else if(x.Discriminant()==0)
            System.out.println("Same roots : "+x.calcRoot1());
        else
            System.out.println("The equation has no roots");
        
    }
    
}
