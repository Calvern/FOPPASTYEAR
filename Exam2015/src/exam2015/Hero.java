/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2015;

/**
 *
 * @author user
 */
public class Hero {
    protected String name,type;
    protected int hp;
    public Hero(String name,String type){
        this.name=name;
        this.type=type;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
  
    public void display(){
        System.out.println(this.name+" ("+this.type+") - HP: "+this.hp);
    }
}
