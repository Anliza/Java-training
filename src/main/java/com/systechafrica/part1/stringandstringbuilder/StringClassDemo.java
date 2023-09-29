package com.systechafrica.part1.stringandstringbuilder;

import java.util.logging.Logger;

public class StringClassDemo {
    private static final Logger LOGGER = Logger.getLogger(StringClassDemo.class.getName());

    public static void main(String[] args) {
        
        //? strings are immutable i.e. once created they cannot be modified
        //? unless they are reassigned
    

        //! Any operations on a string variable results in the creation of a new string => immutability
        String message ="Hello";
        //no effect
        message.concat("world");
        //has effect by reassignment 
        message = message.concat(" programmer");
        LOGGER.info(message);


    }
}
