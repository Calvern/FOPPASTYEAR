/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016;

/**
 *
 * @author user
 */
public class Rebate extends CreditCard {
    
    public Rebate(String name,String cardnumber){
        super(name,cardnumber,"Cash Rebate");
        
    }

    
    
    public void getReward(String []type,double[] total){
        double cashrebate=0;
        for(int i=0;i<type.length;i++){
        if(type[i].equals("Fuel"))
            cashrebate+=total[i]*0.08;
        else if(type[i].equals("Utility"))
            cashrebate+=total[i]*0.05;
        else if(type[i].equals("Grocery"))
            cashrebate+=total[i]*0.02;
        else if(type[i].equals("Other"))
            cashrebate+=total[i]*0.002;
        }
        
        setCashreward(cashrebate);
        
    }
    
}
