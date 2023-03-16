/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the number of random integer: ");
        int n=sc.nextInt();
        int [] integers= new int[n];
        for(int i=0;i<integers.length;i++){
            integers[i]=r.nextInt(1001);
        }
        Display(integers);
        FindMax(integers);
        Rounding(integers);
        System.out.println("The random integer in reverse order: "+Reverse(integers));
                
        
    }
        public static void Display(int[]a){
            String str ="The random integer ";
            for(int i=0;i<a.length;i++){
                str+=" "+a[i];
            }
            System.out.println(str);
        }
        public static void FindMax(int []a){
            int max=a[0];
            for(int i=0;i<a.length;i++){
                if(a[i]>max)
                    max=a[i];
            }
            System.out.println("Maximum number: "+max);
        }
        public static void Rounding(int []a){
            int temp;
            int rounded;
            String str= "The approximation of the integer to the nearest tenth= :";
            for(int i=0;i<a.length;i++){
                temp=a[i]%10;
                if(temp<5)
                    str+=" "+(a[i]-temp);
                else  
                    str+=" "+(a[i]+(10-temp));
                
            }
            System.out.println(str);
                
        }
        public static String Reverse(int []a){
            String str="";
            int temp;
            int x;
            
            for(int i=0;i<a.length;i++){
               String num="";
               temp=a[i];
               while(temp>0){
                   x=temp%10;
                   num+=x;
                   temp/=10;
                   
               }
               str+=num+" "; 
                
            }
            return str;
            
        }
    }
    

