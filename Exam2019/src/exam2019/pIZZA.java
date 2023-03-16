/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2019;

/**
 *
 * @author user
 */
public class pIZZA {
    private String size;
    private int numOfCheeseTopping,numOfBeefTopping,numOfChickenTopping;

    public pIZZA(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        setSize(size);
        setNumOfCheeseTopping(numOfCheeseTopping);
        setNumOfBeefTopping(numOfBeefTopping);
        setNumOfChickenTopping(numOfChickenTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    public double computeCost(){
        if (size.equals("Small"))
            return 10+2*numOfBeefTopping+2*numOfCheeseTopping+2*numOfChickenTopping;
        else if(size.equals("Medium"))
            return 12+2*numOfBeefTopping+2*numOfCheeseTopping+2*numOfChickenTopping;
        else
            return 14+2*numOfBeefTopping+2*numOfCheeseTopping+2*numOfChickenTopping;
    }
    public void display(){
        System.out.println("Pizza size: "+size);
        System.out.println("Number of Cheese Topping: "+numOfCheeseTopping);
        System.out.println("Number of Chicken Topping: "+numOfChickenTopping);
        System.out.println("Number of Beef Topping: "+numOfBeefTopping);
        System.out.println("Cost of pizza: "+computeCost());
    }
}
