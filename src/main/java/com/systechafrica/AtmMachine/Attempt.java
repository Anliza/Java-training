package com.systechafrica.AtmMachine;

import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);
           // detailConfirmation();
            String MY_USERNAME = "anliz";
            String MY_PASSWORD = "Admin123";

            int inputRequest = 3;
            

            //Prompt one
            while (inputRequest > 1){
                System.out.print("Enter your username: ");
                String username = scanner.nextLine();

                System.out.print ("Enter your password: ");
                String password = scanner.nextLine();

                boolean isUsername = username.equals(MY_USERNAME);
                boolean isPassword = password.equals(MY_PASSWORD);
                if(isUsername && isPassword){
                    System.out.println("USER DETAILS CONFIRMED");
                }           
                else {
                    System.err.println("Incorrect username or password.");
                    System.out.println(" ");
                    
                }
                System.out.println("Enter details again: ");   
                System.out.println(+ inputRequest + " remaining entries left");
                inputRequest --;
        }
        System.out.println("Detail entry attempts exhausted.");  
        scanner.close();
        }  

    
}
