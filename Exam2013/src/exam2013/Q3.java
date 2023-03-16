/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2013;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author user
 */
public class Q3 {
    public static void main(String[] args) throws IOException  {
        try{
            DecimalFormat df = new DecimalFormat("0.00");
            BufferedReader inputstream = new BufferedReader(new FileReader("Q3.txt"));
            BufferedWriter outputstream = new BufferedWriter(new FileWriter("ringgit.txt"));
            String line;
            while((line=inputstream.readLine())!=null){
                
            String Q3content=line;
            double ringgit;
            String [] foreigninfo=Q3content.split(" ");
            switch(foreigninfo[0]){
                case "AUD":
                    ringgit=Double.parseDouble(foreigninfo[1])*3.25;
                    break;
                case "SG":
                    ringgit=Double.parseDouble(foreigninfo[1])*2.53;
                    break;
                case "EU":
                    ringgit=Double.parseDouble(foreigninfo[1])*4.03;
                    break;
                case "USD":
                    ringgit=Double.parseDouble(foreigninfo[1])*3.11;
                    break;
                default:
                    ringgit=0;
                }
            String output= foreigninfo[0]+" "+foreigninfo[1]+" = RM "+df.format(ringgit)+"\n";
                System.out.print(output);
                outputstream.write(output);
                
            }
            inputstream.close();
            outputstream.close();
           
        }catch(FileNotFoundException e){
            System.out.println("File is not found");
        }
    }
}
