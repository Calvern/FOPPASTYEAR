/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2015;

import java.util.Random;

/**
 *
 * @author user
 */
public class Q4 {
    
    public static void main(String[] args) {
        
        Strength a = new Strength("Chaos Knight","Strength",30);
        Agility b= new Agility("Bloodseeker","Agility",25);
        a.display();
        b.display();
        System.out.println();
        playGame(a,b);
    }
    
    public static void playGame(Strength a,Agility b){
        Random r = new Random();
        int i=r.nextInt(2);
        while(a.getHp()>0&&b.getHp()>0){
            if(i==0){
                a.Damage(b);
                if(b.getHp()<=0)
                    break;
                b.Damage(a);
            }
            else if(i==1){
                b.Damage(a);
                if(a.getHp()<=0)
                    break;
                a.Damage(b);
            }
        }
        if(a.getHp()<=0)
            System.out.println(b.getName()+" wins the game!");
        else
            System.out.println(a.getName()+" wins the game!");
    }
}
