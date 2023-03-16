/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016sem2;

/**
 *
 * @author user
 */
public class FinancialRecord {
    private int id;
    private double balance,annualInterestRate;
    
    public FinancialRecord(){
        this.id=0;
        this.balance=0;
        this.annualInterestRate=0;
    }
    public FinancialRecord(int id, double balance){
        this.id=id;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public void withdraw(double amount){
        
        balance-=amount;
        System.out.println("Current balance after withdrawal of "+amount+" is: RM"+balance);
        
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Current balance after deposit of "+amount+" is: RM"+balance);
    }
    public void displayRecordInfo(){
        System.out.println("The information about financial record A is as follows:");
        System.out.println("Financial record id is: "+id);
        System.out.println("Financial record balance is: RM"+balance);
        System.out.println("Annual interest rate is:"+annualInterestRate);
    }
           
            
}
    
