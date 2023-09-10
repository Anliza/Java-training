package com.systechafrica.hotelmenu;

import java.util.Scanner;

public class HotelMenu {
    Scanner scanner = new Scanner(System.in);
    final String DEFAULT_PASSWORD = "Admin123";
    int mealTotal;
    int payamentAmount;
    //int balance;
    

    public static void main(String[] args) {
        HotelMenu menu = new HotelMenu();
        menu.cashierScreen();
    }

       
    public boolean loginH(){
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
        
        return logInSuccess;
    }
    
    public void displayMenu(){
        System.out.println("-----------------");
        System.out.println("SYSTECH RESTAURANT:");
        System.out.println();
        System.out.println("DRINKS");
        System.out.println("-----------------");
        System.out.println("1. CHAI------------------------------------------15");
        System.out.println("2. ANDAZI----------------------------------------10");
        System.out.println("3. TOSTI----------------------------------=------12");
        System.out.println();
        System.out.println("MEALS");
        System.out.println("-----------------");
        System.out.println("4. NDENGU AND ACCOMPLISHMENTS--------------------70");
        System.out.println("5. NDENGU AND ACCOMPLISHMENTS--------------------70");
        System.out.println("3. PILAU VEG-------------------------------------90");
        System.out.println("7. QUIT");
    }

    public int mealAmount(int a,int b,int ...otherNumbers){
            mealTotal = a+b;
    
            for (int i=0; i < otherNumbers.length; i++){
                mealTotal+= otherNumbers[i];
            }
            return mealTotal;

        }
    
    public void cashierScreen(){
        int noOfOptions = 1;
        boolean optionsSelected = false;
        //boolean firstChoiceSelected = false;
        while (noOfOptions > 0){
            System.out.println("Enter your meal/drink option: ");
            int option = scanner.nextInt();
           // firstChoiceSelected =true;
           // while(firstChoiceSelected){
                System.out.print("Do you want to enter another meal/drink option: ");
                String anotherOption = scanner.next();
                if(anotherOption.equalsIgnoreCase("N")){
                    optionsSelected = true;
                    break;
                }else if(anotherOption.equalsIgnoreCase("Y")){
                    //firstChoiceSelected = true;
                    noOfOptions++;
                    
                }else{
                    System.out.println("You have entered an invalid option. Enter Y/N for yes or No");
                }
                
           // }
        //break;
        }
        System.out.println("-------------------");
        while (optionsSelected){
            System.out.println("Proceed to Payment: ");
            String toPayament = scanner.next();
            if(toPayament.equalsIgnoreCase("N")){
                System.out.println("choose Y for yes and N for no");
            }
            else if(toPayament.equalsIgnoreCase("Y")){
                System.out.println("Pay now for:");
                //get data for the option
                System.out.println("************************");
                System.out.println("Total:-------------------" + mealTotal);
                System.out.println("Enter amount to Pay:");
                payamentAmount = scanner.nextInt();
                System.out.println("Your Balance is--------" + balanceBank());
                System.out.println("************************");
                break;
            }
            else{
                System.out.println("choose Y for yes and N for no");
            }
        }
    }
    
    public int balanceBank(){
        int balance = 0;
        if (payamentAmount > mealTotal){
            balance = payamentAmount - mealTotal;
            
        }
        return balance; 
    }
}
