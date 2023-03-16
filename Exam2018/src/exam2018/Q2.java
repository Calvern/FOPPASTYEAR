/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2018;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter N number: ");
        int N=sc.nextInt();
        int [] number= new int[N];
        int aaa=0,aa=0,a=0;
        for(int i=0;i<number.length;i++){
            number[i]=r.nextInt(101)+50;
            if(number[i]%10<=3)
                aaa++;
            else if(number[i]%10<=6)
                aa++;
            else
                a++;
                        
        }
        System.out.print("The random numbers are:");
        for(int i=0;i<number.length;i++){
            System.out.print(" "+number[i]);
        }
        System.out.println("");
        System.out.println("Group AAA: "+aaa);
        System.out.println("Group AA: "+aa);
        System.out.println("Group A: "+a);
    }
}
