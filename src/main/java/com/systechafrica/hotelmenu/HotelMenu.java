package com.systechafrica.hotelmenu;

import java.util.Scanner;

public class HotelMenu {
    Scanner scanner = new Scanner(System.in);
    final String DEFAULT_PASSWORD = "Admin123";
    final int MAX_OPTIONS = 50;
    Options[] options = new Options[MAX_OPTIONS];
    int noOfOptions = 0;
    Options opt = new Options();
    static int mealTotal;
    static int payamentAmount;
    static int option;
    
    

    public static void main(String[] args) {
        HotelMenu menu = new HotelMenu();
        Scanner scan = new Scanner(System.in);
        
        //int noOfOptions = 1;
        //boolean firstChoiceSelected = false;

        boolean logInSuccess = menu.loginH();
        if (logInSuccess){
            System.out.println("Successful Login.");
            System.out.println();
            boolean outputMenu = true;
            while (outputMenu){
                menu.displayMenu();
                menu.cashierScreen();
                break;
            }
        }
        else{
            System.out.println("You have exhausted your log in attempts.");
        }
        scan.close();
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
        System.out.println();
        System.out.println();
        System.out.println("Choose your Drink/Meal-one at a time:");
    }

    
    public static int balanceBack(){
        int balance = 0;
        if (payamentAmount > mealTotal){
            balance = payamentAmount - mealTotal;
            
        }
        return balance; 
    }
    
    public void optionss(){
       
    }

    public void cashierScreen(){
        
        boolean optionsSelected = false;
        //boolean firstChoiceSelected = false;
        while (true){
            System.out.print("Enter your meal/drink option: ");
            option = scanner.nextInt();
            System.out.println(option);

            switch (option){
                    case 1:
                        opt.setOption("Chai------------------------15");
                        opt.setPrice(15);
                        break;
                    case 2:
                        opt.setOption("Andazi----------------------10");
                        opt.setPrice(10);
                        break; 
                    case 3:
                        opt.setOption("Tosti-----------------------12");
                        opt.setPrice(12);
                        break; 
                    case 4:
                        opt.setOption("Ndengu and accomplishments--70");
                        opt.setPrice(70);
                        break;  
                    case 5:
                        opt.setOption("Beans and accomplishments----70");
                        opt.setPrice(70);
                        break;
                    case 6:
                        opt.setOption("Pilau Veg--------------------90");
                        opt.setPrice(90);
                        break;
                    case 7:
                        System.out.println("Thank You");
                        break;
                
                }
            
            Options selOptions = new Options(opt.getOption(), opt.getPrice());
            options[noOfOptions] = selOptions;
            noOfOptions++;

           
           // while(firstChoiceSelected){
            System.out.print("Do you want to enter another meal/drink option: ");
            String anotherOption = scanner.next();
            if(anotherOption.equalsIgnoreCase("N")){
                optionsSelected = true;
                break;
            }else if(anotherOption.equalsIgnoreCase("Y")){
                optionsSelected = true;
                
                
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
                mealTotal = 0;
                for(int i = 0; i < noOfOptions; i++){
                    Options newOptions = options[i]; 
                    System.out.println(newOptions.getOption());

                    mealTotal += newOptions.getPrice();
                }
                //get data for the option
                System.out.println("************************");
                System.out.println("Total:-------------------" + mealTotal);
                System.out.println("Enter amount to Pay:");
                payamentAmount = scanner.nextInt();
                System.out.println("Your Balance is--------" + balanceBack());
                System.out.println("************************");
                break;
            }
            else{
                System.out.println("choose Y for yes and N for no");
            }
        }
    }
    
    
}
