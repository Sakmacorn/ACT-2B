/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author CL1-PC16
 */
public class NewClass {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Rock Paper Scissors Game!");
        System.out.println("[1] Rock");
        System.out.println("[2] Paper");
        System.out.println("[3] Scissors");
        
        System.out.print("Enter Player 1: ");
        int x = input.nextInt();
        System.out.print("Enter Player 2: ");  
        int y = input.nextInt();
        
        if (x == 1 && y == 1 ||
            x == 2 && y == 2 ||
            x == 3 && y == 3 ){
            System.out.println("Draw");
        }
        else if (x == 1 && y == 3 ||
                 x == 2 && y == 1 ||
                 x == 3 && y == 2){
            System.out.println("Player 1 Wins");
        }
        else if (x == 1 && y == 2 ||
                 x == 2 && y == 3 ||
                 x == 3 && y == 1) {
            System.out.println("Player 2 WIns");
        }
        else {
            System.out.println("Please Input Valid Number! :3");
        }
        
    }
}
