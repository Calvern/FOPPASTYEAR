/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016sem2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int a=sc.nextInt();
        int sum=0;
        while(a>0){            
            sum+=a%10;
            a/=10;
        }
        System.out.println("The sum of the digits is "+sum);
    }
}
