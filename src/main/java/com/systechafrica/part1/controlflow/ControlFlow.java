package com.systechafrica.part1.controlflow;

import java.util.logging.Logger;

public class ControlFlow {
    private static final Logger LOGGER =Logger.getLogger(ControlFlow.class.getName());
    public void ifElseStatement(){
        int maths = 56;
         LOGGER.info("Score = " + maths);
        if (maths >= 70) {
         LOGGER.info("Student grade is A " );
        }else if (maths <70 && maths >= 60){
             LOGGER.info("Student grade is B " );
        }else if (maths <60 && maths >= 50){
             LOGGER.info("Student grade is C " );
        }else if (maths <50 && maths >= 40){
             LOGGER.info("Student grade is D " );
        }else {
             LOGGER.info("Student grade is F " );
        }
        //*Done*/  add conditions to assign grade variables as exxpected
       
    }
    public void switchStatement(){
        String day = "UNKNOWN";
        switch(day){
            case "MONDAY":
                LOGGER.info("Monday working day");
                break;
            case "TUSDAY":
                LOGGER.info("Tuesday working day");
                break;
            case "WEDNESDAY":
                LOGGER.info("Wednesday working day");
                break;
            case "THURSDAY":
                LOGGER.info("Thursday working day");
                break;
            case "FRIDAY":
                LOGGER.info("Friday working day");
                break;
            case "SATURDAY":
            case "SUNDAY":
                LOGGER.info("Rest ama Sherehe");
                break;
            default:
                LOGGER.info("Please specify a valid day");
        }

    }
    public static void main(String[] args) {
        ControlFlow app = new ControlFlow();
        app.ifElseStatement();
        //app.switchStatement();
    }
    
}
