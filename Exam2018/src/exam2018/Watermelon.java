/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2018;

/**
 *
 * @author user
 */
public class Watermelon extends Fruit {
    private double weight;
    public Watermelon(String name,String type, double weight){
        super(name,type);
        this.weight=weight;
    }
    public double totalPrice(){
            if(type.equals("Local")){
                if(weight<2)
                    return weight*2.25;
                else if(weight<=5)
                    return weight*1.95;
                else
                    return weight*1.65;
            }
            else
                if(weight<2)
                    return weight*3.75;
                else if(weight<=5)
                    return weight*3.45;
                else
                    return weight*3.15;
    }
    public String toString(){
        return super.toString()+" - "+weight+"kg = RM"+totalPrice();
    }
    
}
