/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2016;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class Q4 {

    public static void main(String[] args) {
        try {
            BufferedReader inputstream = new BufferedReader(new FileReader("Q4.txt"));
            String line = inputstream.readLine();

            while (line != null) {
                boolean a = false, b = false, c = false, d = false, e = false;
                if (line.length() >= 8) {
                    a = true;
                
                for (int i = 0; i < line.length(); i++) {
                    char x = line.charAt(i);
                    if (Character.isUpperCase(x)) {
                        b = true;
                        continue;
                    }
                    if (Character.isLowerCase(x)) {
                        c = true;
                        continue;
                    }
                    if (Character.isDigit(x)) {
                        d = true;
                        continue;
                    }
                    if (!Character.isAlphabetic(x)) {
                        e = true;                        
                    }
                }
                }
                if (a && b && c && d && e) {
                    System.out.println("Strong password");
                } else {
                    System.out.println("Not a strong password");
                }
                line = inputstream.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
