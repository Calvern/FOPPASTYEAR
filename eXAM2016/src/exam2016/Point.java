/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016;

/**
 *
 * @author user
 */
public class Point extends CreditCard {
    
    public Point(String name,String cardnumber){
        super(name,cardnumber,"Point Reward");
    }
    public void getReward(String []day,double[] total){
        int point=0;
        for(int i=0;i<day.length;i++){
        if(day[i].equals("Friday"))
            point+= Math.floor(total[i])*2;
        else if(day[i].equals("Saturday"))
            point+= Math.floor(total[i])*3;
        else if(day[i].equals("Sunday"))
            point+= Math.floor(total[i])*4;
        else
            point+=Math.floor(total[i]);
        }
        setCashreward(point*0.01);
            
    }
    
}
