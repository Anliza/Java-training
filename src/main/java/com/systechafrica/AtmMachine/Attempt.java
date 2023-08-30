package com.systechafrica.AtmMachine;

import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double operatingBalance = 1000;
        System.out.println("Choose service option:");
        String option = scanner.nextLine();

        if(option.equals("1")){
             System.out.println("Your Balance is Ksh." + operatingBalance);
             //then
             System.out.println("Select another service:");  
        }
        else if (option.equals("2")){
            System.out.println ("Enter amount to deposit "); 
            int depositAmount = scanner.nextInt();
            operatingBalance = depositAmount + operatingBalance;
            System.out.println("Your Balance is Ksh." + operatingBalance);
        }
        else if (option.equals("3")){
            System.out.println ("Enter amount to withdraw ");
            int withdrawAmount = scanner.nextInt();
            if (operatingBalance > withdrawAmount){
                double withdrwalCharges = 0.02 * withdrawAmount;
                operatingBalance =  operatingBalance - withdrawAmount - (double) withdrwalCharges;
                System.out.println("Your witdrawal charge is Ksh." + withdrwalCharges);
                System.out.println("Your Balance is Ksh." + operatingBalance);
                }
                else {
                    System.out.println("Go back to the main menu ");
            }
        }
        else if (option.equals("4")){
            System.out.println ("Enter amount to tranfer ");
             int transferAmount = scanner.nextInt();
            if (operatingBalance > transferAmount){
                operatingBalance =  operatingBalance - transferAmount;
                System.out.println("Your Balance is Ksh." + operatingBalance);
                }
                else {
                    System.out.println("Go back to the main menu ");
                }
            }
        else if (option.equals("5")){
            System.exit(0);
        }
        else {
            System.out.println("You entered an invalid option.");
        }
        scanner.close();    
    }
}



    //app.inputUsernameAndPassword();
       //app.operatingBalance();
