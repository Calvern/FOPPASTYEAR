/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016;

/**
 *
 * @author user
 */
public class CreditCard {
    private String name,cardnumber,cardtype;  
    private double cashreward;  
    
    public CreditCard(String name, String cardnumber,String cardtype){
        this.name=name;
        this.cardnumber=cardnumber;
        this.cardtype=cardtype;
        this.cashreward=0;
    }

    public double getCashreward() {
        return cashreward;
    }

    public void setCashreward(double cashreward) {
        this.cashreward = cashreward;
    }
    public String toString(){
        return "Credit Card : "+name+" ("+cardnumber+")\nCard Type : "+cardtype+"\nTotal Cash Reward : "+cashreward;
    }
        
}
