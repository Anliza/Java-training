package com.systechafrica.AtmMachine;

import java.util.Scanner;
import java.util.logging.Logger;

import com.systechafrica.Operators.OperatorsDemo;

public class ATMMachine {
    private static final Logger LOGGER = Logger.getLogger(OperatorsDemo.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String MY_USERNAME = "anliz";
        final String MY_PASSWORD = "Admin123";

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
        } 
        else {
            System.err.println("Incorrect username or password");
            System.out.println(" ");
            System.out.println("Enter details again: ");

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
            } 
            else {
                System.err.println("Incorrect username or password");
            }
        scanner.close();
        }
    }
}
