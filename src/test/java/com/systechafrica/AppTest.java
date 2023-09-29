package com.systechafrica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.systechafrica.part1.Another;
import com.systechafrica.part1.App;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //? default instance
public class AppTest {

    //? reference => App
    App app = new App();
    Another another = new Another();

   @Test
    void add (){
        //when (arrange)
        int result = app.add(2, 3);
        //then (act or simulate)
        int expected = 5;
        //verify result = expected (assert)
        Assertions.assertEquals(expected, result, "the sum of 2 + 3 should be 5");
    }
    //running the test again
    @Test
    void inProduct (){
        int result = Another.inProduct(2,3);
        int expected = 6;
        Assertions.assertEquals(expected, result);
    }
}