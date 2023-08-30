package com.systechafrica.AtmMachine;

import java.util.Scanner;

import java.util.logging.Logger;

public class ATMMachine {
   private static final Logger LOGGER = Logger.getLogger(ATMMachine.class.getName());
   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       ATMMachine app = new ATMMachine();
       
       app.detailConfirmation();
       app.displayPage();
       }

    public void displayPage(){
        System.out.println ("********************");
        System.out.println ("ATM SIMULATOR");
        System.out.println ("....................");
        System.out.println ("ATM SERVICES");
        System.out.println ("____________________");
        System.out.println ("1. Check Balance");
        System.out.println ("2. Deposit");
        System.out.println ("3. Withdraw");
        System.out.println ("4. Transfer Cash");
        System.out.println ("5. Quit");
        System.out.println ("......................");
    }   
    public void detailConfirmation(){
        String MY_USERNAME = "anliz";
        String MY_PASSWORD = "Admin123";

        int inputRequest = 3;
        
        //Prompt 
        while (inputRequest > 0){
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print ("Enter your password: ");
            String password = scanner.nextLine();

            boolean isUsername = username.equals(MY_USERNAME);
            boolean isPassword = password.equals(MY_PASSWORD);
            if(isUsername && isPassword){
                System.out.println("USER DETAILS CONFIRMED");
                displayPage();
                break;
            }           
            else {
                System.err.println("Incorrect username or password.");
                System.out.println(" ");
                
            }
            inputRequest --;
            System.out.println("Enter details again: ");   
            System.out.println(+ inputRequest + " remaining entries left");
            System.out.println("No more attempts."); 
    }
    
    //displayPage();

    scanner.close(); 
    } 
}