package com.systechafrica.assignments.AtmMachine;

import java.util.Scanner;

public class ATMMachineReviewed {
    Scanner scanner = new Scanner(System.in);

    final double INITIAL_BALANCE = 1000.00;
    final double WITHDRAWAL_CHARGES = 0.02;
    final String DEFAULT_PASSWORD = "Admin123";
    double runningBalance = INITIAL_BALANCE;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMMachineReviewed app = new ATMMachineReviewed();
        boolean loggedIn = app.login();
        if(loggedIn) {
            System.out.println("Logged in successfully.");
            boolean keepShowingMenu = true;
            while(keepShowingMenu){
                app.displayMenu();
                System.out.print("Choose a transaction.");
                String option = scanner.nextLine();
                if(option.equals("1")){
                app.checkBalance();
                }
                else if (option.equals("2")){
                    app.performDeposit();
                }
                else if (option.equals("3")){
                    app.performWithdrawal();
                }
                else if (option.equals("4")){
                app.performTransfer();
                }               
                else if (option.equals("5")){
                    app.printReceipt();
                    keepShowingMenu = false;
                }
                else {
                System.out.println("You have entered an invalid option.");
                System.out.println("Choose a another option.");
            }

            /*  switch(option){
                    case ("1"):
                        app.checkBalance();
                        break;
                    case ("2"):
                        app.performDeposit();
                        break;
                    case ("3"):
                        app.performWithdrawal();
                        break;
                    case ("4"):
                        app.performTransfer();
                        break;
                    case("5"):
                        app.printReceipt();
                        keepShowingMenu = false;
                    default:
                        System.out.println("You have entered an invalid option.");
                        System.out.println("Choose a another option.");
                } */
            }

        }
        else{
            System.out.println("Maximum login attempts failed.");
        }
        scanner.close();
    }

    public boolean login(){
        //?try three times and exit if not logged in
        int loginEntries = 1;
        boolean loggedIn = false;
        while(loginEntries<=3){
            System.out.print("Enter your password.");
            String userPassword = scanner.nextLine();
            if(userPassword.equals(DEFAULT_PASSWORD)) {
                //show menu
                loggedIn = true;
                break;
        }   
        System.out.println("Wrong password."); 
        loginEntries++;   
        }
        return loggedIn;
    }

    public void displayMenu(){
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

    public void checkBalance(){
        System.out.println("Your balance is: " + runningBalance);
    }

    public void performDeposit(){
        System.out.println("Enter the amount to deposit.");
        double depositAmount = scanner.nextDouble();
        runningBalance += depositAmount;
    }
    
    public void performWithdrawal(){
        System.out.println ("Enter amount to withdraw ");
        double withdrawAmount = scanner.nextDouble();
        double withdrwalCost = WITHDRAWAL_CHARGES * withdrawAmount;
        double totalAmountWithdrawn = withdrwalCost + withdrawAmount;
        if (runningBalance > totalAmountWithdrawn){
            runningBalance -= totalAmountWithdrawn;
        }
        else{
            System.out.println("Your balance is:" + runningBalance);

        }
    }

    public void performTransfer(){
        System.out.println ("Enter amount to transfer ");
        double transferAmount = scanner.nextDouble();
        if (runningBalance > transferAmount){
            runningBalance -= transferAmount;
        }
        else{
            System.out.println("Your balance is:" + runningBalance);

        }

    }
    
    public void printReceipt(){
        System.out.println("Thank you for your transaction.");
        System.out.println("Your account balance is:" + runningBalance);
    }
}

