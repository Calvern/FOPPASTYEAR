/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2017;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class Q3 {
    public static void main(String[] args) {
        try{
        Random r = new Random();
        int a;
        int i=0;
        char[]character=new char[6];
        
        BufferedWriter outputstream= new BufferedWriter(new FileWriter("data.txt"));
        
        StringBuilder sb = new StringBuilder();
        while(i<6){
            a=r.nextInt(58)+65;
            
            if(a>=65&&a<=90||a>=97&&a<=122){
                sb.append((char)(a));
                character[i]=(char)(a); 
                i++;
            }        
        }
        
        outputstream.write(sb.toString());
         
        System.out.println("The string generated is: "+sb.toString());
         
        Sort(character,'>');
        System.out.print("String sorted in ascending order: ");
        for(int j=0;j<character.length;j++){
            System.out.print(character[j]);
        }
        System.out.println("");
        Sort(character,'<');
        System.out.print("String sorted in descending order: ");
        for(int j=0;j<character.length;j++){
            System.out.print(character[j]);
        }
        System.out.println("");
        System.out.println("Original string from file: "+sb.toString());
        
                
        outputstream.close();
        
        
        
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void Sort(char[]a,char b){
        switch(b){
            case '>':
                for(int i=0;i<a.length;i++){
                    for(int j=i;j<a.length;j++){
                        if(a[i]>a[j]){
                            char temp=a[j];
                            a[j]=a[i];
                            a[i]=temp;
                        }
                    }
                } break;
            case'<':
                for(int i=0;i<a.length;i++){
                    for(int j=i;j<a.length;j++){
                        if(a[i]<a[j]){
                            char temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
                    }
                }break;
        }
        }
    
}
    

