/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2018sem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class Q3 {

    /**
     * @param args the command line arguments
     
     */
    public static void main(String[] args) throws IOException {
            BufferedReader inputstream = new BufferedReader(new FileReader("student.txt"));
            String line=inputstream.readLine();
            String []names= new String[10];
            double []marks=new double[10];
            int num=0;
            int[]index=new int[10];
            while(line!=null){
                String []temp=line.split(",");
                names[num]=temp[0];
                marks[num]=Double.parseDouble(temp[1]);
                index[num]=num;
                num++;
                line=inputstream.readLine();
            }
            inputstream.close();
            int absent=0;
            for(int i=0;i<names.length;i++){
                for(int j=i;j<names.length;j++){                   
                    if(marks[index[i]]>marks[index[j]]){
                        int temp=index[i];
                        index[i]=index[j];
                        index[j]=temp;   
                    }
                }
                if(marks[i]==-1){
                    absent++;
                }
            }
            System.out.println("The student with the highest mark: "+names[index[9]]+" "+marks[index[9]]);
            System.out.println(names[1]);
            for(int i=0;i<names.length;i++){
                if(marks[index[i]]!=-1.0){
                System.out.println("The student with the lowest mark: "+names[index[i]]+" "+marks[index[i]]);
                break;
                }
            }
            System.out.println("The number of students who were absent from the exam : "+absent);
            
            
    }
    
}
