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
public class Strength extends Hero {
    Random r = new Random();
    public Strength(String name,String type, int hp){
        super(name,type);
        this.hp=hp;
    }

  

   
    
    public void Damage(Hero a){
        int damage=r.nextInt(8)+3;
        a.hp-=damage;
        
        System.out.println(this.name+" damage "+damage+" *** "+a.name+" ("+a.type+") - HP:"+a.hp);
                
        
        
    }
}
