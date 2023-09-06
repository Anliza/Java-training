package com.systechafrica.userinput;

import java.util.Scanner;

public class UserInputUsingScanner {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String DB_USERNAME = "Anliz";
        final String DB_PASSWORD = "Admin123";

        System.out.print("Enter your username; ");
        String username =scanner.nextLine();

        System.out.print("Enter your password; ");
        String password =scanner.nextLine();

        if(username.equals(DB_USERNAME) && password.equals(DB_PASSWORD)){
            System.out.println("Welcome to my website");
        }
        else{
            System.err.println("Incorrect usernaame and password");
        }

        scanner.close();
    }
    
}
