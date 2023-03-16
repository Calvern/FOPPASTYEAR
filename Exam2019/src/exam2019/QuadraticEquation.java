/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2019;

/**
 *
 * @author user
 */
public class QuadraticEquation {
    private int a,b,c;
    public QuadraticEquation(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public int Discriminant(){
        return b*b-4*a*c;
    }
    public double calcRoot1(){
        if(Discriminant()>=0){
        double r1=(-b+Math.sqrt(Discriminant()))/2*a;
        return r1;
        }
        else return 0;
    }
    public double calcRoot2(){
        if(Discriminant()>=0){
        double r2=(-b-Math.sqrt(Discriminant()))/2*a;
        return r2;
        }
        else return 0;
    }
    
}
