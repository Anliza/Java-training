package com.systechafrica.looping;

import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.systechafrica.controlflow.ControlFlow;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class LoopingStatementsTest {
    private static final Logger LOGGER =Logger.getLogger(ControlFlow.class.getName());
    LoopingStatements app = new LoopingStatements();

    @Test
    public void test_number_in_range_of_one_fifty(){
        int search = app.search (10);
        LOGGER.info("Search value: " +search);
        Assertions.assertEquals(10, search);
    }
}
