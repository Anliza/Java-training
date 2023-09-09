package com.systechafrica.part2.classes;

import java.util.logging.Logger;

public class Intern {

    public static void main(String[] args) {
        int array [] = {5,4,3,2,1};
        int len = array.length;
        int index = 0;
        while(index<len){
            System.out.println(array[index]);
            index = index + 1;
       }
    }

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
