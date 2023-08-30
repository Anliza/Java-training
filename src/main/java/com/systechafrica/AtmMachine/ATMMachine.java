package com.systechafrica.AtmMachine;

import java.util.Scanner;
import java.util.logging.Logger;

public class ATMMachine {
   private static final Logger LOGGER = Logger.getLogger(ATMMachine.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String MY_USERNAME = "anliz";
        final String MY_PASSWORD = "Admin123";

        //Prompt one
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print ("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals(MY_USERNAME) && password.equals(MY_PASSWORD)){
            System.out.println ("***************");
            System.out.println ("ATM SIMULATOR");
            System.out.println ("'''''''''''''''");
            System.out.println ("ATM SERVICES");
            System.out.println ("_______________");
            System.out.println ("1. Check Balance");
            System.out.println ("2. Deposit");
            System.out.println ("3. Withdraw");
            System.out.println ("4. Transfer Cash");
            System.out.println ("5. Quit");
            System.out.println (",,,,,,,,,,,,,,,,");
        } 
        else {
            System.err.println("Incorrect username or password");
            System.out.println(" ");
            System.out.println("Enter details again: ");

            //Propmt two
            System.out.print("Enter your username: ");
            String username1 = scanner.nextLine();

            System.out.print ("Enter your password: ");
            String password1 = scanner.nextLine();

            if (username1.equals(MY_USERNAME) && password1.equals(MY_PASSWORD)){
                System.out.println ("***************");
                System.out.println ("ATM SIMULATOR");
                System.out.println ("'''''''''''''''");
                System.out.println ("ATM SERVICES");
                System.out.println ("_______________");
                System.out.println ("1. Check Balance");
                System.out.println ("2. Deposit");
                System.out.println ("3. Withdraw");
                System.out.println ("4. Transfer Cash");
                System.out.println ("5. Quit");
                System.out.println (",,,,,,,,,,,,,,,,");
            } 
            else {
                System.err.println("Incorrect username or password");
                System.out.println(" ");
                System.out.println("Enter details again: ");

                //Prompt three
                System.out.print("Enter your username: ");
                String username2 = scanner.nextLine();

                System.out.print ("Enter your password: ");
                String password2 = scanner.nextLine();

                if (username2.equals(MY_USERNAME) && password2.equals(MY_PASSWORD)){
                    System.out.println ("***************");
                    System.out.println ("ATM SIMULATOR");
                    System.out.println ("'''''''''''''''");
                    System.out.println ("ATM SERVICES");
                    System.out.println ("_______________");
                    System.out.println ("1. Check Balance");
                    System.out.println ("2. Deposit");
                    System.out.println ("3. Withdraw");
                    System.out.println ("4. Transfer Cash");
                    System.out.println ("5. Quit");
                    System.out.println (",,,,,,,,,,,,,,,,");
                } 
                else {
                    System.err.println("Incorrect username or password");
                    System.err.println("You have exhausted your number of login attempts");
                }
            }
        scanner.close();
        }
    }
}
