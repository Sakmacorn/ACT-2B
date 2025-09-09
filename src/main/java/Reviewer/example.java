package Reviewer;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * Author: Miguel Lulu
 */
public class example {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Kaya HashMap ginawa ko dito para magkasama na yung Name ng product and Price nya lol       
        HashMap<String, Integer> snacks = new HashMap<>();
        snacks.put("Hotdog", 15);
        snacks.put("Siomai", 35);
        
        HashMap<String, Integer> drinks = new HashMap<>();
        drinks.put("Coke", 15);
        drinks.put("Water", 10);
        
        // Then dito na mag output yung menu ng cafeteria
        // Kaya nag while ako dito para kapag nag input si user ng wala sa choices is mag tatanong ulit sya.
        int choice = 0;

        while (choice != 1 && choice != 2) {
            System.out.println("Cafeteria");
            System.out.println("[1] Snacks");
            System.out.println("[2] Drinks");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            // Next is dito na ma i-istored yung variables sa snanks or drinks 
            HashMap<String, Integer> selectedCategory = null;
        
            // Mag condition na sa baba neto :3
            if (choice == 1){
                selectedCategory = snacks;
            }
            else if (choice == 2){
                selectedCategory = drinks;
            }
            else {
                System.out.println("Invalid Choice!");
                continue; 
            }
//            Dito naman yung itemlist, medjo naguguluhan ako sa for loop since mahaba yung code and daming nakalagay haha
            ArrayList<String> itemList = new ArrayList<>(selectedCategory.keySet());
            
            System.out.println("Available Items: ");
            for (int i = 0; i < itemList.size(); i++) { 
                String item = itemList.get(i);
                System.out.println("[" + (i + 1) + "] " + item +   " [P" + selectedCategory.get(item) + ".00]");
            }

            int itemChoice = 0;

            // Looping to, kapag di ininput ni user yung valid number is mag ask si program ng question ulit.
            while (itemChoice < 1 || itemChoice > itemList.size()) {
                System.out.print("Enter your item number: ");
                itemChoice = input.nextInt();

                if (itemChoice < 1 || itemChoice > itemList.size()) {
                    System.out.println("Invalid Item Choice! Please try Again.");
                }
            }
//            Dito na yung mga price ng items
            String selectedItem = itemList.get(itemChoice - 1);
            int price = selectedCategory.get(selectedItem);
            
            System.out.println(selectedItem + "Price is [P" + price + ".00]");
            System.out.print("Enter Quantity: ");
            int quantity = input.nextInt();
//            Calculation na dito
            int subtotal = price * quantity;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;
            
            System.out.printf("Subtotal: P%.2f\n", (double) subtotal);
            System.out.printf("VAT (12%%): P%.2f\n", vat);
            System.out.printf("Total: P%.2f\n", total);
            
//            Cash Looping
            double cash;
            do {
                System.out.print("Enter your cash: ");
                cash = input.nextDouble();
                
                if (cash < total){
                    System.out.println("Insufficient Amount! Please try Again!");
                }
            } while (cash < total);
                
            double change = cash - total;
            System.out.printf("Your change is: P%.2f\n", change);
            
            System.out.println("Thank you for purchasing " + selectedItem +"!");
            
            break;
            
            
        }
        
    }
}
