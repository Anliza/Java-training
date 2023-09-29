package com.systechafrica.part1.arrays;

import java.util.logging.Logger;
  

public class WorkingWithArrays{
    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public void singleDimensionalArrays(){
        int[] numbers = {34, 45, 67, 23, 54, 56 }; //int numbers

        int ages[] = { 45, 10, 26, 35, 40, 59 }; // c/c++ array is also valid in java not commonly used
        LOGGER.info(""+ages);
        String[] nickNames = { "mhusika", "Ntate", "Yokana" };
        
        for(int i = 0; i < numbers.length; i++) {
            LOGGER.info("" + numbers[i]);

        }

        LOGGER.info(nickNames[0]);
        LOGGER.info(nickNames[1]);
        LOGGER.info(nickNames[2]);

        int[] a = { 1, 2, 3, 4, 5 }; 
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] % 2 != 0) {
                LOGGER.info("" + a[i]); 
            }
        }
    }

    public void multiDimensionalArrays(){
        int [][] matrix = {{1,2,3},{4,5,5},{7,8,9}};

        //length of multi dimension array we count the number of elements in the parent array
        int length = matrix.length;
        LOGGER.info("multi dimensional array length = "+ length);
        LOGGER.info("number 8 = "+ matrix[2][1]);

        
        int [][] matrix3 = new int [3][3]; //? a multi dimensional array with length 3 
                                            //? and individual elements of 3 in each array

        int [][] matrix4;
        matrix4= new int [3][];
        LOGGER.info(matrix3 +" " + matrix4);//unlogically solving problems

        // Setting values for the array
        
        int [][] matrix2 = new int [3][3]; //? a multi dimensional array with length 3
        //row1
        matrix2[0][0]= 10;
        matrix2[0][1]= 15;
        //row2
        matrix2[1][2]= 15;
        //row3
        matrix2[2][0]= 20;
        matrix2[2][2] =30;

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j]+ " ");
                //LOGGER.info (matrix2[i][j]+ " ");
        
            }
            System.out.println();
            //LOGGER.info ( " \n");
        }

    }   

    public static void main(String[] args) {
        WorkingWithArrays app = new WorkingWithArrays();
        //app.singleDimensionalArrays();
        app.multiDimensionalArrays();
    }
}
 