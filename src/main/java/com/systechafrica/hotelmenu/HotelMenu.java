package com.systechafrica.hotelmenu;

import java.util.Scanner;

import com.systechafrica.reusablecode.ReusableCode;

public class HotelMenu {
    Scanner scanner = new Scanner(System.in);
    final int MAX_OPTIONS = 50;
    Option[] options = new Option[MAX_OPTIONS];
    int noOfOptions = 0;
    Option opt = new Option();
    static int mealTotal;
    static int payamentAmount;
    static int option; 

    public static void main(String[] args) {
        ReusableCode rs = new ReusableCode();
        HotelMenu menu = new HotelMenu();
        Scanner scan = new Scanner(System.in);

        boolean logInSuccess = rs.login();
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
    
    public void cashierScreen(){
        boolean optionsSelected = false;
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
            
            Option selOptions = new Option(opt.getOption(), opt.getPrice());
            options[noOfOptions] = selOptions;
            noOfOptions++;

            System.out.print("Do you want to enter another meal/drink option: ");
            String anotherOption = scanner.next();
            if(anotherOption.equalsIgnoreCase("N")){
                optionsSelected = true;
                break;
            }else if(anotherOption.equalsIgnoreCase("Y")){
                optionsSelected = true;

            }else{
                System.out.println("You have entered an invalid option. Enter Y/N for yes or No");
                noOfOptions--;
            }
                
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
                //get data for each option
                for(int i = 0; i < noOfOptions; i++){
                    Option newOptions = options[i]; 
                    System.out.println(newOptions.getOption());

                    mealTotal += newOptions.getPrice();
                }
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
