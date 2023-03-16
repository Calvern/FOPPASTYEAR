/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2019;

/**
 *
 * @author user
 */
public class Order {
    protected String name,ID;
    protected int quantity;
    protected double unitprice;
    
    public Order(){
        this.name="";
        this.ID="";
        this.quantity=0;
        this.unitprice=0;
    }
    
    public Order(String name,String ID,int quantity,double unitprice){
        this.name=name;
        this.ID=ID;
        this.quantity=quantity;
        this.unitprice=unitprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    public double computeTotalPrice(){
        return quantity*unitprice;
    }
    @Override
    public String toString(){
        return "Order record\nCustomer Name : "+name+"\nCustomer ID : "+ID+"\nQuantity Ordered: "+quantity+"\nUnit Price: "+unitprice+"\nTotal Price : "+computeTotalPrice();
        
    }
    
}
