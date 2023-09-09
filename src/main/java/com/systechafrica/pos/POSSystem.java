package com.systechafrica.pos;

import java.util.Scanner;
import java.util.logging.Logger;

public class POSSystem {
    private static final Logger LOGGER = Logger.getLogger(POSSystem.class.getName());
    Scanner scanner = new Scanner(System.in);

    final String DEFAULT_PASSWORD = "Admin123";
    int itemCode;
    int quantity;
    double unitPrice;
    double total;
    public static void main(String[] args) {
        POSSystem pos = new POSSystem();
        pos.addItem();
        pos.makePayment();
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
        System.out.println("You are out of login attempts.");
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
        System.out.print("Enter Item Code: ");
        itemCode = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        quantity = scanner.nextInt();
        System.out.print("Enter the Unit Price: ");
        unitPrice = scanner.nextDouble();
        total = quantity * unitPrice;
        System.out.println(total);
    }

    public void makePayment(){
        
       // System.out.println("Item Code", "Quantity", " Unit Price", "Total Value");
        //System.out.println( itemCode, quantity, unitPrice, total );
    }

}
