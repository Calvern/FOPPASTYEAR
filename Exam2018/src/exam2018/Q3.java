
package exam2018;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size=sc.nextInt();
        System.out.print("Enter font type: ");
        char type=sc.next().charAt(0);
        System.out.print("Enter format: [1 - Vertical, 2-Horizontal]:");
        int format=sc.nextInt(); 
        Display(size,type,format);
        
    }
    public static void Display(int size,char type,int format){
        if(format==1){
            for(int row=1;row<=size*2+3;row++){
                for(int column=1;column<=size+2;column++){
                    if(row==1||row==size+2||row==size*2+3){
                        System.out.print(type);              
                    }
                    else{
                            if(column==1||column==size+2)
                            System.out.print(type);
                            else
                            System.out.print(" ");
                    }                
                }
             System.out.println();       
         }
    }
        if(format==2){
            for(int row=1;row<=size+2;row++){
                for(int column=1;column<=size*2+3;column++){
                    if(row==1||row==size+2)
                        System.out.print(type);
                    else
                        if(column==1||column==size+2||column==size*2+3)
                            System.out.print(type);
                        else
                            System.out.print(" ");
                }
                System.out.println();
                }
    }
    }
}
            




