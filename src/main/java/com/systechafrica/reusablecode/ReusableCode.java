package com.systechafrica.reusablecode;

import java.util.Scanner;

public class ReusableCode {
    Scanner scanner = new Scanner(System.in);
    final String DEFAULT_PASSWORD = "Admin123";
    
    public static void main(String[] args) {
        ReusableCode reuse = new ReusableCode();
        reuse.login();
    }

    public boolean login(){
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
}
