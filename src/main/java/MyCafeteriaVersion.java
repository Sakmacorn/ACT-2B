/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author CL1-PC16
 */
public class MyCafeteriaVersion {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int hanselPrice = 10;
        int skyFlakesPrice = 12;
        int colaPrice = 15;
        int royalPrice = 18;

    
        int price = 0;
        String item = "";

        
        System.out.println("Cafeteria");
        System.out.println("Menu:");
        System.out.println("Snacks:");
        System.out.println("[1] Hansel - P" + hanselPrice);
        System.out.println("[2] SkyFlakes - P" + skyFlakesPrice);
        System.out.println("Drinks:");
        System.out.println("[3] Cola - P" + colaPrice);
        System.out.println("[4] Royal - P" + royalPrice);

        int choice;
    
        while (true) {
            System.out.print("Choose your Option (1-4): ");
            choice = input.nextInt();

        
            if (choice == 1) {
                price = hanselPrice;
                item = "Hansel";
                break; 
            } else if (choice == 2) {
                price = skyFlakesPrice;
                item = "SkyFlakes";
                break;
            } else if (choice == 3) {
                price = colaPrice;
                item = "Cola";
                break; 
            } else if (choice == 4) {
                price = royalPrice;
                item = "Royal";
                break;
            } else {
                System.out.println("Please input a valid choice (1-4).");
            }
        }

    
        System.out.println("You chose " + item);
        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        
        int subtotal = quantity * price;
        double vat = subtotal * 0.12;
        double total = subtotal + vat;

        
        System.out.println("Subtotal: ₱" + subtotal);
        System.out.println("Tax (12%): ₱" + vat);
        System.out.println("Total amount: ₱" + total);

        
        System.out.print("Enter your cash: ₱");
        int cashGiven = input.nextInt();

        
        while (cashGiven < total) {
            System.out.println("Insufficient cash! Please enter enough money.");
            System.out.print("Enter your cash: ₱");
            cashGiven = input.nextInt();  // Keep asking until enough cash is provided
        }

        
        double change = cashGiven - total;
        System.out.println("Your change: ₱" + change);

        input.close();
    }
}
