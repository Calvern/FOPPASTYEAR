/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2018;

/**
 *
 * @author user
 */
public class Q5 {
    public static void main(String[] args) {
        Fruit a = new Apple("Apple","Red",8);
        Fruit b = new Apple("Apple","Green",11);
        Fruit c= new Watermelon("Watermelon","Local",7.6);
        Fruit d= new Watermelon("Watermelon","Imported",4);
        Fruit[] fruit = {a,b,c,d};
        double min=a.totalPrice();
        int index=0;
        for(int i=0;i<fruit.length;i++){
            if(min>fruit[i].totalPrice()){
                min=fruit[i].totalPrice();
                index=i;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("The cheapest item is");
        System.out.println(fruit[index]);
    }
}
