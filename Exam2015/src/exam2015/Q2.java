/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2015;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tender: ");
        int num=sc.nextInt();
        sc.nextLine();
        String[]name = new String[num];
        double []price = new double[num];
        int[]index = new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter name: ");
            name[i]=sc.nextLine();
            System.out.print("Enter reservation price: ");
            price[i]=sc.nextDouble();
            sc.nextLine();
            index[i]=i;
            
        }
        for(int i=0;i<num;i++){
            for(int j=i;j<num;j++){
                if(price[index[i]]<price[index[j]]){
                    int temp=index[j];
                    index[j]=index[i];
                    index[i]=temp;
                }
            }
        }
        System.out.println("List of tender :");
        for(int i=0;i<num;i++){
            if(i!=num-1)
                System.out.print(name[index[i]]+", ");
            else
                System.out.println(name[index[i]]);
        }
        System.out.printf("The winner of BMW88 : %s (%.2f)",name[index[0]],price[index[0]]);
    }
}
