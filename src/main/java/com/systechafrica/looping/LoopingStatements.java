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
    public void breakJumpStatements(){
        for (int index = 0; index < 10; index++){
            if( index == 5) { //?when the index gets to 5 upon execution (executes 5 times, 0-4), the loop terminates
            break; //?break allows for loop to terminate after condition is met
            }
            LOGGER.info ("my index is:" + index);//?this is skipped after condition is met and loop terminates
        }
        LOGGER.info ("after my loop" ); //?execution moves to here after loop terminates
    }
      
    public void continueJumpStatements(){
        for (int index = 0; index < 10; index++){
            if( index == 5) {//?when the index gets to 5 upon execution (executes 5 times, 0-4), the loop skip the said iteration
            continue;//?contine allows for the loop to skip the iteration in the condition
            }
            LOGGER.info ("my index is:" + index);//?does not print out 5(condition iteration),Proceeds to print 6 onwards
        }
        LOGGER.info ("after my loop" );//?also outputed after completion of the loop. in this case after "my indes is 9"
    }
    public static void main(String[] args) {
        LoopingStatements app = new LoopingStatements(); 
        //app.forLoop();
        //app.whileLoop(); 
        //app.doWhileLoop(); 
        //app.breakJumpStatements();
        app.continueJumpStatements();
    }
}