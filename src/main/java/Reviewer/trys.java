package Reviewer;
import java.util.Scanner;

public class trys {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
            int HanzelPrice = 10;
            int SkyFlakesPrice = 12;
            int ColaPrice = 15;
            int RoyalPrice = 15;
            
            System.out.println("Cafeteria");
            System.out.println("Menu");
            System.out.println("Snacks");
            System.out.println("[1] Hansel");
            System.out.println("[2] SkyFlakes");
            System.out.println("Drinks");
            System.out.println("[3] Cola");
            System.out.println("[4] Royal");
            System.out.print("Choose your Option: ");
            int choice = input.nextInt();
            
            int price = 0;
            String item = "";
            
            if (choice == 1){
                price = HanzelPrice;
                item = "Hanzel";
            } else if(choice == 2){
                price = SkyFlakesPrice;
                item = "SkyFlakes";
            } else if (choice == 3){
                price = ColaPrice;
                item = "Cola";
            } else if (choice == 4){
                price = RoyalPrice;
                item = "Royal";
            } else {
                System.out.println("Please input valid choice!");
                return;
            }
            
            System.out.println("You chose " + item);
            System.out.println("Enter Quantity of Item: ");
            int quan = input.nextInt();
            
            int quan1 = quan * price;
            double vat = quan1 * 0.12;
            double total = quan1 + vat;
            
            System.out.printf("Subtotal: P%.2f\n", (double) quan1);
            System.out.printf("Tax (12%%): P%.2f\n", vat);
            System.out.printf("Your total is P%.2f\n", total);
            
            System.out.print("Enter your Cash: ");
            int cashg = input.nextInt();
            
            
            while (cashg < total) {
                System.out.println("Insufficient Payment!!");
                System.out.println("Enter your Cash: ");
                cashg = input.nextInt();
                
            }
            double change = cashg - total;
            System.out.printf("Your change is: P%.2f\n " , change);
            
            
            
            
            
    }
}
