/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2017;

/**
 *
 * @author user
 */
import java.util.Scanner;
//Filename:Q1.java
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1=0,number2=0, number3=0, number4=0, number5=0;
        int inputNumber;
        int value=0;
        int counter=1;
        while(counter<=5){
            System.out.println("Enter number:");
            inputNumber=input.nextInt();
            if(inputNumber>=1&&inputNumber<=30){
                switch(counter){
                    case 1: number1=inputNumber;break;
                    case 2: number2=inputNumber;break;
                    case 3: number3=inputNumber;break;
                    case 4: number4=inputNumber;break;
                    case 5: number5=inputNumber;break;
                }
                counter++;
            }
            else
                System.out.println("Invalid Input\nNumber should be between 1 and 30");
            
        }
        for(int i=1;i<=5;i++){
            switch(i){
                case 1: value=number1;break;
                case 2: value=number2;break;
                case 3: value=number3;break;
                case 4: value=number4;break;
                case 5: value=number5;break;
            }
            
            for(int j=1;j<=value;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
    
}
