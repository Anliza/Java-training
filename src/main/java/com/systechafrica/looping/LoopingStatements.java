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
        while(studentCount < 10){
            LOGGER.info("Student Count = " + studentCount);
            studentCount++; //studentCount = studentCount +1
    }
}
    public void doWhileLoop(){
        int studentCount = 0;
        do {LOGGER.info("Student Count = " + studentCount); 
        studentCount ++;  
        } while (studentCount <5); 
    }
public static void main(String[] args) {
        LoopingStatements app = new LoopingStatements();
        //app.forLoop();
        //app.whileLoop(); 
        app.doWhileLoop(); 
    }
}