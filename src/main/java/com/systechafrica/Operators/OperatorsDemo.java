package com.systechafrica.Operators;

import java.util.logging.Logger;


public class OperatorsDemo {
    private static final Logger LOGGER = Logger.getLogger(OperatorsDemo.class.getName());

    private void arithmeticOperators(){
        // Addition Operator
        int studentOneAge = 22;
        int studentTwoAge = 19;

        int totalClassAge = studentOneAge + studentTwoAge;

        LOGGER.info("Total Class Age: " + totalClassAge);

        // Subtraction Operator
        int ageDifference =studentOneAge - studentTwoAge;
        LOGGER.info("Age Difference: " + ageDifference);

        //Multiplication Operator
        int ageProduct = studentOneAge * studentTwoAge;
        LOGGER.info("Age Product: " + ageProduct);

        //Division Operator
        //? Division between integers result to an integer value or double value result
        //!division without precision, only give integer results
        int divisionResult = studentOneAge / studentTwoAge;
        LOGGER.info("Division: " + divisionResult);

        //! To ensure correct values with precision
        double divisionResultInDouble = (double)studentOneAge / studentTwoAge;
        LOGGER.info("Division with precision: " + divisionResultInDouble);

        // Modulus Operator
        int remainder = studentOneAge % studentTwoAge;
        LOGGER.info("Remainder after Division: " + remainder);

    }
    private void assignmentOperators(){
       // Simple assingment operator
        int quantity = 35;
        
        // addition assignment operator
        quantity += 10; // it equvalent is quantity = quantity + 10; 
        LOGGER.info("Quantity: " + quantity);

        // multiplication assignment operator
        quantity *= 100; // its equivalent is quantity = quantity*100;
        LOGGER.info("Quantity: " + quantity);

        // Division assignment operator
        quantity /= 5; // its equavalent is quantity = quantity / 5;
        LOGGER.info("Quantity: " + quantity);

        //Modulo assignment 
        quantity %= 7; // quantity = quantity % 5;
        LOGGER.info("Quantity: " + quantity);
    }
    
    public static void main(String[] args) {
        OperatorsDemo app = new OperatorsDemo(); //Instance
        //app.arithmeticOperators();
        app.assignmentOperators();
    }
    //just adding a change before continuing to assignment operators
    //opportunity to document arithmetic operators commit
}
