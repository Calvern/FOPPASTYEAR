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
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the marks for Grammar(maximum 30 marks): ");
        double grammar=sc.nextDouble();
        System.out.print("Enter the marks for Spelling(maximum 20 marks): ");
        double spelling=sc.nextDouble();
        System.out.print("Enter the marks for Length(maximum 20 marks): ");
        double length=sc.nextDouble();
        System.out.print("Enter the marks for Content(maximum 30 marks): ");
        double content=sc.nextDouble();
        Essay a = new Essay(grammar,spelling,length,content);
        System.out.println(a.toString());
        System.out.println("\nTotal score:"+a.getScore());
        System.out.println("Essay grade: "+a.getGrade());
        
    }
}
