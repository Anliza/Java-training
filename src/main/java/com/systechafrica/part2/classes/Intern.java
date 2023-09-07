package com.systechafrica.part2.classes;

import java.util.logging.Logger;

public class Intern {
    private static final Logger LOGGER = Logger.getLogger(Intern.class.getName());
    String name;
    String phoneNumber;
    String email;

    public Intern(String name, String phoneNumber, String email){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Intern(){

    }

    public void attendClass(){
        LOGGER.info("Attend class");
    }

    public void doAssignments(){
        LOGGER.info("Do assignments");
    }
}
