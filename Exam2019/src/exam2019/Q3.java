
package exam2019;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc= new Scanner(System.in);
        while(true){
        int num1=r.nextInt(10);
        int num2=r.nextInt(10);
        int answer=num1+num2;
        int input;
        System.out.print("What is "+num1+" + "+num2+ "? " );
        input=sc.nextInt();
        if(input==answer)
             System.out.println(num1+" + "+num2+" = "+input+" is true");
        else 
             System.out.println(num1+" + "+num2+" = "+input+" is false");
         System.out.print("Do you want to answer another question (y/n) ? : ");
         char a=sc.next().charAt(0);
         if(a=='n')break;
    }
        System.out.println("Program ends");
}
}
