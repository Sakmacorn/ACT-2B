package Reviewer;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

/**
 *
 * Author: Miguel Lulu
 */
public class JavaWithArrayReviewer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> snacks = new HashMap<>();
        snacks.put("Hotdog", 15);
        snacks.put("Siomai", 35);

        HashMap<String, Integer> drinks = new HashMap<>();
        drinks.put("Coke", 15);
        drinks.put("Water", 10);

        double cash;
        double remainingCash;

        // Ask user for cash once
        System.out.print("Enter your cash: ");
        cash = input.nextDouble();
        remainingCash = cash;

        HashSet<String> purchasedItems = new HashSet<>();

        // Main ordering loop
        while (true) {
            int choice = 0;

            // Ask until valid category
            while (choice != 1 && choice != 2) {
                System.out.println("Cafeteria");
                System.out.println("[1] Snacks");
                System.out.println("[2] Drinks");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                if (choice != 1 && choice != 2) {
                    System.out.println("Invalid Choice!");
                }
            }

            HashMap<String, Integer> selectedCategory = (choice == 1) ? snacks : drinks;
            ArrayList<String> itemList = new ArrayList<>(selectedCategory.keySet());

            System.out.println("Available Items:");
            for (int i = 0; i < itemList.size(); i++) {
                String item = itemList.get(i);
                System.out.println("[" + (i + 1) + "] " + item + " [P" + selectedCategory.get(item) + ".00]");
            }

            int itemChoice = 0;
            while (itemChoice < 1 || itemChoice > itemList.size()) {
                System.out.print("Enter your item number: ");
                itemChoice = input.nextInt();

                if (itemChoice < 1 || itemChoice > itemList.size()) {
                    System.out.println("Invalid Item Choice! Please try Again.");
                }
            }

            String selectedItem = itemList.get(itemChoice - 1);
            int price = selectedCategory.get(selectedItem);

            System.out.println(selectedItem + " Price is [P" + price + ".00]");
            System.out.print("Enter Quantity: ");
            int quantity = input.nextInt();

            int subtotal = price * quantity;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;

            System.out.printf("Subtotal: P%.2f\n", (double) subtotal);
            System.out.printf("VAT (12%%): P%.2f\n", vat);
            System.out.printf("Total: P%.2f\n", total);

            // Check if enough cash
            if (total > remainingCash) {
                System.out.println("Insufficient funds for this purchase!");
                System.out.printf("Your remaining cash: P%.2f\n", remainingCash);
                System.out.println("Transaction cancelled.");
                break;
            }

            remainingCash -= total;

            System.out.printf("Purchase successful! Remaining balance: P%.2f\n", remainingCash);
            purchasedItems.add(selectedItem);
            System.out.println("Thank you for purchasing " + selectedItem + "!");

            // Ask if the user wants to order again
            input.nextLine(); // Clear buffer
            System.out.print("Do you want to order again? [y/n]: ");
            String again = input.nextLine().toLowerCase();

            if (!again.equals("y")) {
                System.out.printf("Your final change is: P%.2f\n", remainingCash);
                System.out.println("Purchased items:");
                for (String item : purchasedItems) {
                    System.out.println("- " + item);
                }
                break;
            }
        }

        input.close();
    }
}
