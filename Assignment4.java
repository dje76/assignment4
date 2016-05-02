/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;


import java.util.Scanner;
/**
 *
 * @author Daniel Eads dje76
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input; 
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Select a function to run:\n1. Body mass index calculator");
            System.out.println("2. Retirement calculator\n3. Distance calcualtor\n4. email varifier");
        
            input = in.nextLine();
        }
        while(!input.matches("1") && !input.matches("2") && !input.matches("3") & !input.matches("4"));
        
        System.out.println(input);
        
    }
    
}
