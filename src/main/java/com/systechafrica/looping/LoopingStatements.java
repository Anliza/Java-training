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
    public static void main(String[] args) {
        LoopingStatements app = new LoopingStatements();
        app.forLoop(); 
    
    }
    
}
