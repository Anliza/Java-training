package com.systechafrica.part1.stringandstringbuilder;

import java.util.logging.Logger;

public class StringBuilderClassDemo {
    private static final Logger LOGGER = Logger.getLogger(StringBuilderClassDemo.class.getName());
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(); //creation

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        LOGGER.info("" +sb);

    }
}
