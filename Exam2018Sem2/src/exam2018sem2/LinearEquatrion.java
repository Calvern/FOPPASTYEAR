/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2018sem2;

/**
 *
 * @author user
 */
public class LinearEquatrion {
    private double a,b,c,d,e,f;
    public LinearEquatrion(double a,double b,double c,double d,double e,double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
       
    }
    public String toString(){
        String equation1=a+"x+"+b+"y="+e;
        String equation2=c+"x+"+d+"y="+f;
        return "The equation : \n"+equation1+"\n"+equation2;
    }
    public boolean isSolvable(){
        if((a*d-b*c)!=0)
            return true;
        else return false;
    }
    public double computeX(){
        double x=(e*d-b*f)/(a*d-b*c);
        return x;
    }
    public double computeY(){
        double y=(a*f-e*c)/(a*d-b*c);
        return y;
    }
        
}
