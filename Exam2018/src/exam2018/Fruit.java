/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2018;

/**
 *
 * @author user
 */
public abstract class Fruit{
    String name,type;
    public Fruit(String name,String type){
        this.name=name;
        this.type=type;
    }
    public abstract double totalPrice();
    
    public String toString(){
        return name+" "+type;
    }
}
