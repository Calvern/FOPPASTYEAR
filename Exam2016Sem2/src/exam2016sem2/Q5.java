
package exam2016sem2;
import java.util.Random;

public class Q5 {   
    public static void main(String[] args) {
        Random r=new Random();
        int [][]board=new int[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=r.nextInt(2);
                System.out.print(board[i][j]);
                
            }
            System.out.println("");
        }
        for(int i=0;i<board.length;i++){
            int countrow=0,countcolumn=0;           
            for(int j=0;j<board[i].length;j++){                    
            if(board[i][j]==1)
                countrow++;
            if(board[j][i]==1)
                countcolumn++;
                }  
            if (countrow==3)
                System.out.println("All 1s on row "+i);
            if(countcolumn==3)
                System.out.println("All 1s on column "+i);     
        }
        if(board[0][0]==1&&board[1][1]==1&&board[2][2]==1)
            System.out.println("All 1s on left diagonal");
        if(board[2][0]==1&&board[1][1]==1&&board[0][2]==1)
            System.out.println("All 1s on right diagonal");
       
    }
}
