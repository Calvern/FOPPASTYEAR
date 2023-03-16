/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2013;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char letter;
        int count = 0;
        do {
            System.out.print("Enter a letter(Q to quit): ");
            letter = s.next().charAt(0);
            if (letter == 'Q') {
                break;
            } else {
                count++;
            }
        } while (letter != 'Q');
        System.out.printf("The total of number of character you enter is: %d", count);
    }

}
