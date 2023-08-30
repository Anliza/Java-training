package com.systechafrica.AtmMachine;

import java.util.Scanner;

import java.util.logging.Logger;

public class ATMMachine {
   private static final Logger LOGGER = Logger.getLogger(ATMMachine.class.getName());
   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       ATMMachine app = new ATMMachine();
       
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
    
}