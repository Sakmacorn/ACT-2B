/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author CL1-PC16
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("[1] Addition");
        System.out.println("[2] Multiplication");
        System.out.println("[3] Subtraction");
        System.out.println("[4] Division");
        System.out.println("Choose Operator");
        int z = input.nextInt();
        
        System.out.println("Enter your number: ");
        int x = input.nextInt();
        System.out.println("Enter your number: ");
        int y = input.nextInt();
        
        if (z == 1){
            System.out.println("You choose Addition!!");
            int sum = x + y;
            System.out.print("Your Sum is: " + sum);
        }
        else if (z == 2){
            System.out.println("You choose Multiplication!!");
            int prod = x * y;
            System.out.print("Your product is: " + prod);
        }
        else if (z == 3){
            System.out.println("You choose Subtraction!!");
            int sub = x - y;
            System.out.print("Your difference is: " + sub);
        }
        else if (z == 4){
            System.out.println("You choose Division!!");
            int quo = x / y;
            System.out.println("Your quotient is: " + quo);
        }
        else {
            System.out.println("Please Put Valid Number!! ");
        }
        
    }
}
