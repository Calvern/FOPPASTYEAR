/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2015;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String reverse="";
        System.out.println("Enter a word");
        String word=in.next();
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);   
        }
        
        if (word.equals(reverse))
            System.out.println("The word is a palindrome");
        else
            System.out.println("The word is not a palindrome");
               
               
    }
    
}
