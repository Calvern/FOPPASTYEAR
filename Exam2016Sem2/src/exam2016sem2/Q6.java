/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016sem2;

/**
 *
 * @author user
 */
public class Q6 {
    public static void main(String[] args) {
        FinancialRecord a=new FinancialRecord(1234,10000);
        a.setAnnualInterestRate(7.77);
        a.displayRecordInfo();
        System.out.println("");
        FinancialRecord b = new FinancialRecord(1001,20000);
        b.setAnnualInterestRate(8.0);
        b.displayRecordInfo();
        System.out.println("The monthly interest rate is: "+b.getMonthlyInterestRate());
        System.out.println("Previous balance: "+b.getBalance());
        b.deposit(1500);
        System.out.println("Previous balance: "+b.getBalance());
        b.withdraw(500);
        
    }
    
}
