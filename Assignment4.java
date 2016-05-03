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
        functions function = new functions();
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Select a function to run:\n1. Body mass index calculator");
            System.out.println("2. Retirement calculator\n3. Distance calcualtor\n4. email varifier");
        
            input = in.nextLine();
        }
        while(!input.matches("1") && !input.matches("2") && !input.matches("3") & !input.matches("4"));
        
        switch(input){
            case "1":
                float hight;
                float weight;
                float BMI;
                System.out.println("Enter your hight in inches:");
                hight = Float.parseFloat(in.nextLine());
                
                System.out.println("Enter your weight in pounds:");
                weight = Float.parseFloat(in.nextLine());
                
                BMI = function.BMI(hight,weight);
                
                System.out.println("Your BMI is " + BMI);
                break;
            
            case "2":
                float goal;
                float income;
                float percent;
                int age;
                System.out.println("Enter your retirement goal:");
                goal = Float.parseFloat(in.nextLine());
                
                System.out.println("Enter your yearly income:");
                income = Float.parseFloat(in.nextLine());

                System.out.println("Enter the precent you want to save each year:");
                percent = Float.parseFloat(in.nextLine());
               
                System.out.println("Enter your age:");
                age = Integer.parseInt(in.nextLine());
                
                function.retirement(goal, income, percent, age);
                break;
            
            case "3":
                float x1;
                float x2;
                float y1;
                float y2;
                
                System.out.println("Enter the first x cordanate:");
                x1 = Float.parseFloat(in.nextLine());
                
                System.out.println("Enter the first y cordanate:");
                y1 = Float.parseFloat(in.nextLine());
                
                System.out.println("Enter the second x cordanate:");
                x2 = Float.parseFloat(in.nextLine());
                
                System.out.println("Enter the second y cordanate:");
                y2 = Float.parseFloat(in.nextLine());                
                
                function.distance(x1,y1,x2,y2);
                break;
            
            case "4":
                String email;
                System.out.println("Enter a email you want to varify:");
                email = in.nextLine();

                function.email_varifier(email);
                break;
            
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
