package com.systechafrica.AtmMachine;

import java.util.Scanner;

public class ATMMachine {
   
   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
       ATMMachine atmmachine = new ATMMachine();
       
       atmmachine.detailConfirmation();
       //app.displayPage();
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
        double operatingBalance = 1000;
        boolean detailsOkay = true;
        
        //Prompt 
        while (inputRequest > 0){
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            boolean isUsername = username.equals(MY_USERNAME);
            boolean isPassword = password.equals(MY_PASSWORD);
            if(isUsername && isPassword){
                System.out.println("USER DETAILS CONFIRMED");
                //displayPage();
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
                while (detailsOkay){
                System.out.println("Choose service option:");
                String option = scanner.nextLine();

                if(option.equals("1")){
                    System.out.println("Your Balance is Ksh." + operatingBalance);
                    System.out.println("Request successful"); 
                }
                else if (option.equals("2")){
                    System.out.println ("Enter amount to deposit "); 
                    int depositAmount = scanner.nextInt();
                    operatingBalance = depositAmount + operatingBalance;
                    System.out.println("Your Balance is Ksh." + operatingBalance);
                    System.out.println("Request successful"); 
                }
                else if (option.equals("3")){
                    System.out.println ("Enter amount to withdraw ");
                    int withdrawAmount = scanner.nextInt();
                    if (operatingBalance > withdrawAmount){
                        double withdrwalCharges = 0.02 * withdrawAmount;
                        operatingBalance =  operatingBalance - withdrawAmount - (double) withdrwalCharges;
                        System.out.println("Your witdrawal charge is Ksh." + withdrwalCharges);
                        System.out.println("Your Balance is Ksh." + operatingBalance);
                        System.out.println("Request successful"); 
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
                        System.out.println("Request successful"); 
                    }
                    else {
                            System.out.println("Go back to the main menu ");
                    }
                }               
                else if (option.equals("5")){
                    System.exit(0);
                }
                else {
                    System.out.println("You have entered an invalid option.");
                    }
                    
            }
                break;
            }           
            else {
                System.err.println("Incorrect username or password.");
                System.out.println(" ");
                
            }
            inputRequest --;
            System.out.println("Enter details again: ");   
            System.out.println(+ inputRequest + " remaining entries left");  
        }
    
    //displayPage();

    scanner.close(); 
    } 
}