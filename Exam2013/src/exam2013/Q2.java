/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2013;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String []name= new String[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter student name: ");
            name[i]=sc.nextLine();
        }
        for(int i=0;i<name.length;i++){
            for(int j=i;j<name.length;j++){
                if(name[i].compareToIgnoreCase(name[j])>0){
                    String temp=name[j];
                    name[j]=name[i];
                    name[i]=temp;
                    
                }
            }
        }
        System.out.println("The student names in alphabetical order are: ");
        for(String a: name){
            System.out.println(a);
            
        }               
    }
}
