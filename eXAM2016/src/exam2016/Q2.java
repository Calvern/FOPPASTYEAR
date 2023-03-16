                                                                                                                                                                                                                                                  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016;

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
        int a,b;
        String [] Output = {"Paper","Scissor","Rock"};
        int player=0,comp=0;
        while(player<3&&comp<3){
        System.out.print("Enter 1.Paper 2.Scissor 3.Rock:");
        a=sc.nextInt();
        b=r.nextInt(3)+1;
        System.out.println("Player : "+Output[a-1]+"----- Computer : "+Output[b-1]);
        if(a-b==1||b-a==2){
            player++;
            System.out.println("Player win "+player+" time(s)");                    
        }
        else if(b-1==a||a-b==2){
            comp++;
            System.out.println("Computer win "+comp+" time(s)");
                    
        }
        else if(a==b);
      
    

        }
        if(player==3)
            System.out.println("Player wins the game");
        else System.out.println("Computer wins the game");
         
        
    }
}