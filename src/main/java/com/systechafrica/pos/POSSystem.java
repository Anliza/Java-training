package com.systechafrica.pos;

import java.util.Scanner;


public class POSSystem {
    Scanner scanner = new Scanner(System.in);

    final String DEFAULT_PASSWORD = "Admin123";
    Items buy = new Items(); 
    int itemNumber = 1;
    double sumOfTotalValue;
    double amountByCustomer;
    double changeBack;
    public static void main(String[] args) {
        POSSystem pos = new POSSystem();
        Scanner scanner = new Scanner(System.in);
        boolean logInSuccess = pos.login();
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

    public boolean login(){
        boolean logInSuccess = false;
        int inputs = 1;
        while (inputs <= 3 ){
            System.out.print("Enter your password: ");
            String userPassword = scanner.nextLine();
            if(userPassword.equals(DEFAULT_PASSWORD)){
                logInSuccess =true;
                break;
            }          
            System.out.println("You entered the wrong password.");
            inputs ++;
        }
        
        return logInSuccess;
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
        int noOfItems = 1;
        while(noOfItems >= 1){
            System.out.println("item: " + itemNumber);
            System.out.print("Enter Item Code: ");
            buy.itemCode = scanner.nextInt();
            System.out.print("Enter Quantity: ");
            buy.quantity = scanner.nextInt();
            System.out.print("Enter the Unit Price: ");
            buy.unitPrice = scanner.nextDouble();
            buy.total = buy.quantity*buy.unitPrice;
            System.out.println("Total value: " + buy.total);
            itemNumber ++;
            System.out.print("More items? Press any key for more items or N for no more item:-> ");
            String moreItems = scanner.next();
            if(moreItems.equalsIgnoreCase("N")){
                    break;
                }
            }
            noOfItems++; 
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

    public void sumOfTotals(){
        sumOfTotalValue = 0.0;
        int i = 0;
        while (i < itemNumber){
            sumOfTotalValue += buy.total;
            break;
        }
        i++;
    }

    public void displayReceipt(){
        System.out.print("Item Code  "+ "Quantity  "+ " Unit Price   "+ "Total Value");
        System.out.println();
        for (int i = 1; i<=itemNumber; i++) {
            Items buy = new Items(i, i, i, i);
            System.out.println("   " + buy.itemCode+"         " + buy.quantity+ "          " + buy.unitPrice+ "          " + buy.total);
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
