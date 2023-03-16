/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputstream = new BufferedReader(new FileReader("Q4.txt"));
        String line=inputstream.readLine();
        double highestscore=Double.MIN_VALUE;
        String winner="";
        
        while(line!=null){
            String []temp;
            double sum=0;
            int difficulty;
            double finalscore;
            String name="";
            temp=line.split(",");
            double []score=new double[5];
            name=temp[0];
            for(int i=0;i<score.length;i++){
                score[i]=Double.parseDouble(temp[i+1]);               
            }
            Arrays.sort(score);
            for(int i=1;i<score.length-1;i++){
                sum+=score[i];
            }
            difficulty=Integer.parseInt(temp[6]);
            finalscore=sum*difficulty;
            if(finalscore>highestscore){
                highestscore=finalscore;
                winner=name;
            }
            System.out.println(name+" score "+finalscore);
            line=inputstream.readLine();
            
            
        }
        inputstream.close();
        System.out.println(winner+" is the winner");
        
        
        
    }
}
