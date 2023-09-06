package com.systechafrica.arrays;

import java.util.logging.Logger;
  

public class WorkingWithArrays{
    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public void SingleDimensionalArrays(){
        int[] numbers = {34, 45, 67, 23, 54, 56 }; //int numbers

        int ages[] = { 45, 10, 26, 35, 40, 59 }; // c/c++ array is also valid in java not commonly used

        String[] nickNames = { "mhusika", "Ntate", "Yokana" };
        
        for(int i = 0; i < numbers.length; i++) {
            LOGGER.info("" + numbers[i]);

        }

        LOGGER.info(nickNames[0]);
        LOGGER.info(nickNames[1]);
        LOGGER.info(nickNames[2]);

        int[] a = { 1, 2, 3, 4, 5 }; //
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] % 2 != 0) {
                LOGGER.info("" + a[i]); //
            }
    }
}
    public static void main(String[] args) {
        WorkingWithArrays app = new WorkingWithArrays();
        app.SingleDimensionalArrays();
    }
}

