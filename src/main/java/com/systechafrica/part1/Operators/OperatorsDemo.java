package com.systechafrica.part1.Operators;

import java.util.logging.Logger;


public class OperatorsDemo {
    private static final Logger LOGGER = Logger.getLogger(OperatorsDemo.class.getName());

    public void arithmeticOperators(){
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
    public void assignmentOperators(){
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
    public void comparisonOperations(){
        int studentOneAge = 20;
        int studentTwoAge = 25;

        //equality operator
        boolean isStudentOneAgeEqualToStudentTwoAge = studentOneAge == studentTwoAge;
        LOGGER.info("isStudentOneAgeEqualToStudentTwoAge: " + isStudentOneAgeEqualToStudentTwoAge);

        //inequality operator
        boolean isStudentOneAgeNotEqualToStudentTwoAge = studentOneAge != studentTwoAge;
        LOGGER.info("isStudentOneAgeNotEqualToStudentTwoAge: " + isStudentOneAgeNotEqualToStudentTwoAge);

        //less than operator
        boolean isStudentOneAgeLessThanToStudentTwoAge = studentOneAge < studentTwoAge;
        LOGGER.info("isStudentOneAgeLessThanToStudentTwoAge " + isStudentOneAgeLessThanToStudentTwoAge);

        //Greater than operator
        boolean isStudentOneAgeGreaterThanToStudentTwoAge = studentOneAge > studentTwoAge;
        LOGGER.info("isStudentOneAgeGreaterThanToStudentTwoAge " + isStudentOneAgeGreaterThanToStudentTwoAge);

        //?  Do less than or equal to operator
        boolean isStudentOneAgeGreaterThanOrEqualToStudentTwoAge = studentOneAge >= studentTwoAge;
        LOGGER.info("isStudentOneAgeGreaterThanOrEqualToStudentTwoAge " + isStudentOneAgeGreaterThanOrEqualToStudentTwoAge);

        //?  Do greater than or equal to operator
        boolean isStudentOneAgeLessThanOrEqualToStudentTwoAge = studentOneAge <= studentTwoAge;
        LOGGER.info("isStudentOneAgeLessThanOrEqualToStudentTwoAge " + isStudentOneAgeLessThanOrEqualToStudentTwoAge);
    }
    public void andLogicalOperators(){
        int studentOneAge = 17;
        int studentTwoAge = 25;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        boolean isStudentTwoAllowed = studentTwoAge >= 18;
        //and operator
        if (isStudentOneAllowed && isStudentTwoAllowed) {
            LOGGER.info("All students allowed for ID registration");   
        }else {
                LOGGER.info("Not allowed  for ID registration");
        }
    }
    public void orLogicalOperators(){
        int studentOneAge = 17;
        int studentTwoAge = 25;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        boolean isStudentTwoAllowed = studentTwoAge >= 18;
        //or operator
        if (isStudentOneAllowed || isStudentTwoAllowed) {
            LOGGER.info("Students allowed for ID registration");   
        }else {
                LOGGER.info("Not allowed  for ID registration");
        }
    }
    public void notLogicalOperator(){
        int studentOneAge = 17;
        boolean isStudentOneAllowed = studentOneAge >= 18;
        //not operator
        if (isStudentOneAllowed) {
            LOGGER.info("Students allowed for ID registration");   
        }else {
                LOGGER.info("Not allowed  for ID registration");
        }
    }
    public static void main(String[] args) {
        OperatorsDemo app = new OperatorsDemo(); //Instance
        //app.arithmeticOperators();
        //app.assignmentOperators();
        //app.comparisonOperations();
        //app.andLogicalOperators();
        //app.orLogicalOperators();
        app.notLogicalOperator();
        
    }
    //just adding a change before continuing to assignment operators
    //opportunity to document arithmetic operators commit
}
