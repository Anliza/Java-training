package com.systechafrica.variables;

import java.util.logging.Logger;

public class VariablesDemo {
    private static final Logger LOGGER = Logger.getLogger(VariablesDemo.class.getName());
    private void variableDeclarations(){
        //integer variable
        //? type variableName = value;
        int score = 0;
        LOGGER.info("Score value is " + score);
    }
    private void integerTypes() {
        LOGGER.info("Maximim integer value is " + Integer.MAX_VALUE);
        LOGGER.info("Minimum integer value is " + Integer.MIN_VALUE);

        LOGGER.info("Long maximum value is " + Long.MAX_VALUE);
        LOGGER.info("Long maximum value is " + Long.MIN_VALUE);
    }
    private void constantVariable(){
        //constant variable
        //? final type variableName = value;
        final double PI = 3.14159;
        LOGGER.info("Constant value PI = " + PI);
    }
    private void floatingTypes(){
        //float type
        float floatRate = 2.1234544F;
        //double type
        double doubleRate = 2.1234544;

        LOGGER.info("float value is " + floatRate);
        LOGGER.info("Double value is " + doubleRate);
    }
    private void characterTypes(){
        //char type
        char grade = 'A';
        
        LOGGER.info("character value is " + grade);
        
    }
    private void booleanTypes(){
        //boolean type
        boolean isPromoted = false;
        boolean isProcessed = true;

        LOGGER.info("False value is " + isPromoted);
        LOGGER.info("True value is " + isProcessed);
    }
    public static void main(String[] args) {
        VariablesDemo demo = new VariablesDemo();
        
        demo.integerTypes();
        demo.constantVariable();
        demo.variableDeclarations();
        demo.floatingTypes();
        demo.characterTypes();
        demo.booleanTypes();
    }
    //changes not staged for commit
} 