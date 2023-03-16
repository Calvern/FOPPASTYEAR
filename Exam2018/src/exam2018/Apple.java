/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2018;

/**
 *
 * @author user
 */
public class Apple extends Fruit{
    private int quantity;
    public Apple(String name,String type,int quantity){
        super(name,type);
        this.quantity=quantity;
        
    }
    public double totalPrice(){
        if(type.equals("Green"))
            return quantity*1.20;
        else
            return quantity*1.80;
        
    }
    public String toString(){
        return super.toString()+"-"+quantity+" = RM"+totalPrice();
    }
    
}
