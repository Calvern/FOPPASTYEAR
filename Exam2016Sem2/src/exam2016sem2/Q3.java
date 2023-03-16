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
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line=sc.nextInt();
        for(int i=1;i<=line;i++){
           for(int j=0;j<(line-i);j++){
               System.out.print(" ");           
            }
           for(int k=i;k>=1;k--){
                System.out.print(k);               
                }
           for(int l=1;l<i;l++){
            System.out.print(l+1);
           }
            System.out.println("");
    }
        
}
}
