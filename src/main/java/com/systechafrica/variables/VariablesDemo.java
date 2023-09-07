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
        //byte, long, short, int
        //?wrapper classes

        byte aPrimitive = 23;
        Byte aWrapper = 23;

        LOGGER.info("byte aPrimitive:" + aPrimitive);
        LOGGER.info("Byte aWrapper:" + aWrapper);

        int a = aWrapper.intValue();
        LOGGER.info("Integer value from Byte aWrapper:" + a);

        //short
        short c = 23;
        Short aShort = 23;

        //int
        int b = 23;
        Integer aInt = 23;

        //long
        long d = 23;
        //! One needs to explicitly suffix the long wrapper with an L
        Long aLong = 23L;
        LOGGER.info(c +" "+ aShort +" " + b + " " + d + " " + aInt + " " + aLong);

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

        //float wrapper
        float price = 0.2344F;
        Float priceFloat = 0.2344F;

        //double wrapper
        double pPrice = 0.2344;
        Double pPriceDouble = 0.2344;
        LOGGER.info(pPrice +" "+ pPriceDouble +" " +price + " " + priceFloat);
    }
    private void characterTypes(){
        //char type
        char grade = 'A';
        
        LOGGER.info("character value is " + grade);
        
        //char wrapper
        Character characterGrade = 'F';
        System.out.println(characterGrade);
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

        //Implicit and excplicit casting
        Long a = 2147483648L;

        int b = a.intValue(); //! run with wrapper class Long a
        //int c = (int) a;   //! run with primitive data type long a
        LOGGER.info("int b value" + b);
    }
    //changes not staged for commit
} 