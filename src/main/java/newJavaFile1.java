/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author CL1-PC16
 */
public class newJavaFile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Age Verification!");
        
        System.out.println("Enter your Age: ");
        int x = input.nextInt();
        
        if (x >= 18 && x >= 100){
            System.out.println("Able to vote!");
        }
        else if (x <=17 && x >= 5 ){
            System.out.println("Unable to vote!");
        }
        else if (x == 0){
            System.out.println("Please Put valid Age!");
        }
        else {
            System.out.println("Please Input Valid Number!");
        }
    }
}
