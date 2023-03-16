/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016;

/**
 *
 * @author user
 */
public class q5 {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim","1111222233334444");
        Point p = new Point("John Lim","5555666677778888");
        String []type={"Grocery","Other","Fuel","Utility","Other"};
        String []day={"Saturday","Friday","Sunday","Friday","Tuesday"};
        double[] total={124.80,64.60,95.40,100.00,220.00};
        r.getReward(type,total);        
        System.out.println(r);
        p.getReward(day, total);      
        System.out.println(p);
        if(r.getCashreward()>p.getCashreward())
            System.out.println("The best card is Cash Rebate Card");
    }
}
