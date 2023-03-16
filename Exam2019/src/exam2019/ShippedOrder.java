/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2019;

/**
 *
 * @author user
 */
public class ShippedOrder extends Order {

    public ShippedOrder(String name,String ID,int quantity,double unitprice) {
        super(name,ID,quantity,unitprice);  
        
    }
    @Override
    public double computeTotalPrice(){
        return quantity*unitprice+4;
}
    @Override
    public String toString(){
        return "Shipped\n"+super.toString();
    }
}  
