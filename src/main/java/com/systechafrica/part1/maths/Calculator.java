package com.systechafrica.part1.maths;

import java.util.Scanner;

public class Calculator {
    
    //instance -> does not have static keyword -> can only be accessed using object of the class
    public int sum(int a,int b,int ...otherNumbers){//!var args
        int sum = a+b;

        for (int i=0; i < otherNumbers.length; i++){
            sum += otherNumbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of space separated numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
      

        System.out.println(calculator.sum(a,b,c,d,e));
        System.out.println(calculator.sum(a,b));
        System.out.println(calculator.sum(10,5 ,15,34,45));

        /*System.out.println("Enter your three names space separated: ");
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();

        System.out.println("Firstname" + firstName);
        System.out.println("Middlename" + middleName);
        System.out.println("Lastname" + lastName);*/
    scanner.close();
    }

}
