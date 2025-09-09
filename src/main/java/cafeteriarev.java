/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author CL2~PC27
 */
public class cafeteriarev {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.println("Cafeteria");
        System.out.println("[1] Snacks");
        System.out.println("Hotdog [P25.00]");
        System.out.println("Siomai [P30.00]");
        System.out.println("[2] Drinks");
        System.out.println("Coke [P15.00]");
        System.out.println("Water [P10.00]");
        System.out.println("Enter your Choice: ");
        int choose = input.nextInt();
        
        if (choose == 1){
            System.out.println("[1] Hotdog");
            System.out.println("[2] Siomai");
            int hotdog = 25;
            int siomai = 30;
            System.out.println("Enter your snacks choice:: ");
            int snacks = input.nextInt();
            
            int price = 0;
            String itemName = "";
            
            
            if (snacks == 1){
                itemName = "Hotdog";
                price = hotdog;
        }
            else if (snacks == 2){
                itemName = "Siomai";
                price = siomai;
            }
            else {
                    System.out.println("Invalid snack choice!");
                    return;
            }
            
            System.out.println(itemName + "price is [P" + price + ".00]");
            System.out.println("Enter Quantity: ");
            int quantity = input.nextInt();
            
            int subtotal = price * quantity;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;
            
            System.out.println("Subtotal: P" + subtotal);
            System.out.println("Vat (12%): P" + vat);
            System.out.println("Total: P" + total);
            
            System.out.println("Enter your Cash: ");
            double cash = input.nextInt();
            
            while (cash < total){
                System.out.println("Insufficient Payment! Please Try Again!");
                System.out.println("Enter Payment: ");
                cash = input.nextInt();
            }
            
            double change = cash - total;
            System.out.println("Your Change is:  P" + change);
        }
        else if (choose == 2){
            System.out.println("[1] Coke");
            System.out.println("[2] Water");
            int Coke = 15;
            int Water = 10;
            System.out.println("Enter your snacks choice:: ");
            int drinks = input.nextInt();
            
            int price = 0;
            String itemName = "";
            
            
            if (drinks == 1){
                itemName = "Coke";
                price = Coke;
        }
            else if (drinks == 2){
                itemName = "Water";
                price = Water;
            }
            else {
                    System.out.println("Invalid snack choice!");
                    return;
            }
            
            System.out.println(itemName + "price is [P" + price + ".00]");
            System.out.println("Enter Quantity: ");
            int quantity = input.nextInt();
            
            int subtotal = price * quantity;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;
            
            System.out.println("Subtotal: P" + subtotal);
            System.out.println("Vat (12%): P" + vat);
            System.out.println("Total: P" + total);
            
            System.out.println("Enter your Cash: ");
            double cash = input.nextInt();
            
            while (cash < total){
                System.out.println("Insufficient Payment! Please Try Again!");
                System.out.println("Enter Payment: ");
                cash = input.nextInt();
            }
            
            double change = cash - total;
            System.out.println("Your Change is:  P" + change);
        }
        else {
            System.out.println("Please Input Valid Number! Thank you!");
        }

        
    }
}

