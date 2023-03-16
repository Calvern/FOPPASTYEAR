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
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial tuition fee(i.e year 1):");
        double initialfee=sc.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%):");
        double rate=sc.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year=sc.nextInt();
        System.out.printf("\nComputed tuition fee for year 3 is:%.2f ",computeFee(initialfee,rate,year));
    }
    public static double computeFee(double initialfee,double rate,int year){
        double temp=initialfee;
        for(int i=1;i<year;i++){
            temp+=temp*(rate/100);         
        }
        return temp;
    }
}
