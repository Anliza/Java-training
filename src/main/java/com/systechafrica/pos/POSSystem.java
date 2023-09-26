package com.systechafrica.pos;

import java.util.Scanner;

import com.systechafrica.reusablecode.ReusableCode;


public class POSSystem {
    Scanner scanner = new Scanner(System.in);
    final String DEFAULT_PASSWORD = "Admin123";
    final int MAX_NO = 100;
    Item[] items = new Item[MAX_NO];
    int noOfItems = 0;
    int itemNumber = 1;
    Item buy = new Item();
    double sumOfTotalValue = 0;
    double amountByCustomer;
    double changeBack;

    public static void main(String[] args) {
        POSSystem pos = new POSSystem();
        Scanner scanner = new Scanner(System.in);
        ReusableCode rs = new ReusableCode();
        boolean logInSuccess = rs.login();
        if (logInSuccess){
            System.out.println("Successful Login.");
            System.out.println();
            boolean showMenu = true;
            while (showMenu){
                pos.displayMenu();
                int option = scanner.nextInt();
                System.out.println();
                System.out.println("...");
                switch (option) {
                    case 1:
                        pos.addItem();
                        break;
                    case 2:
                        pos.displayReceipt();
                        pos.makePayment();
                        break;
                    case 3:
                        pos.displayReceipt();
                        System.exit(0);
                        break;
                
                    default:
                        System.out.println("You have entered an invalid option.");
                        System.out.println("Choose a another option.");
                        break;
                }
            }
        }else{
            System.out.println("You have exhausted your log in attempts.");
        }
        scanner.close();
    }

    public void displayMenu(){
        System.out.println("-----------------");
        System.out.println("SYSTEM POS SYSTEM");
        System.out.println("-----------------");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");
        System.out.println(" ");
        System.out.println("Choose an option");

    }
    
    public void addItem(){
        
        while(true){
            System.out.print("Enter Item Code: ");
            int itemCode = scanner.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter the Unit Price: ");
            double unitPrice = scanner.nextDouble();

            Item buyItems = new Item(itemCode, quantity, unitPrice);
            items[noOfItems] = buyItems;
            noOfItems++;

            System.out.print("More items? Press any key for more items or N for no more item:-> ");
            String moreItems = scanner.next();
            if(moreItems.equalsIgnoreCase("N")){
                    break;
                }
            }
    }

    public void makePayment(){
        System.out.println("Ask payment from customer.");
        amountByCustomer = scanner.nextDouble();
        if (amountByCustomer > sumOfTotalValue){
            changeBack = amountByCustomer - sumOfTotalValue;
        }
        else{
            System.out.println("The amount is insufficient. Add some more. ");
        }
    }

    public void displayReceipt(){
        System.out.print("Item Code  "+ "Quantity  "+ " Unit Price   "+ "Total Value");
        System.out.println();
        sumOfTotalValue = 0;
        for (int i = 0; i < noOfItems; i++) {
            Item buy = items[i];
            double totalPrice = buy.quantity * buy.unitPrice;
            System.out.println("   " + buy.itemCode+"         " + buy.quantity+ "          " + buy.unitPrice+ "          " + totalPrice);
        
            sumOfTotalValue += totalPrice;
        }
        System.out.println("*********************************************");
        System.out.println("Total: "  + sumOfTotalValue);
        System.out.println("*********************************************");
        System.out.println("Enter the amount given by customer:  " + amountByCustomer);
        System.out.println("Change:  " + changeBack);
        System.out.println("*********************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("*********************************************");
        
    }

}
