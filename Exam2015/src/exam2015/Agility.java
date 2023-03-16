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
public class Agility extends Hero {
    Random r = new Random();
    public Agility(String name,String type,int hp){
        super(name,type);
        this.hp=hp;
    }

   

    
    
    public void Damage(Hero a){
        int damage= (r.nextInt(5)+1)*(r.nextInt(4));
        a.hp-=damage;
        System.out.println(this.name+" damage "+damage+" *** "+a.name+" ("+a.type+") - HP:"+a.hp);
        
    }
}
