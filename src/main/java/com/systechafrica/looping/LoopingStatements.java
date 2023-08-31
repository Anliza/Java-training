package com.systechafrica.looping;

import java.util.logging.Logger;

import com.systechafrica.controlflow.ControlFlow;

public class LoopingStatements {
    private static final Logger LOGGER =Logger.getLogger(ControlFlow.class.getName());
    public void forLoop(){
        //initialize condition update
        for (int counter = 0; counter <= 10; counter = counter +1 ){
            LOGGER.info("Count = " + counter);
        }
        // (counter = counter + 1) is the same as (counter += 1) and also (counter ++) 
        for (int counter = 0; counter <= 10; counter += 1 ){
            LOGGER.info("Count = " + counter);
        }
        for (int counter = 0; counter <= 10;counter ++ ){
            LOGGER.info("Count = " + counter);
        }
    }
    public void whileLoop(){
        int studentCount = 0;
        int counter = 0;
        while(studentCount < 10){ //at studentCount < 0, the while loop does not execute even once unless the condition is met
            LOGGER.info("Student Count = " + studentCount);
            studentCount++; //studentCount = studentCount +1
            counter ++;
    }
    LOGGER.info("Counter = " + counter);
}
    public void doWhileLoop(){
        int myNumber = 0;
        int counter = 0;
        do {LOGGER.info("muyNumber is = " + myNumber); 
        myNumber ++;  
        counter ++;
        } while (myNumber < 10); //at myNumber < 0, the dowhile loop has to execute atleast once before it checks the condition
        LOGGER.info("Counter = " + counter);// executes first, then it checks the condition
    }
public static void main(String[] args) {
        LoopingStatements app = new LoopingStatements();
        //app.forLoop();
        //app.whileLoop(); 
        app.doWhileLoop(); 
    }
}