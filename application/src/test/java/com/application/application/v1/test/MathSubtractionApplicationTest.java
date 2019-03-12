package com.application.application.v1.test;

import com.application.application.v1.MathMultiplicationApplication;
import com.application.application.v1.MathSubtractionApplication;
import com.application.service.v1.MathMultiplication;
import com.application.service.v1.MathSubtraction;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathSubtractionApplicationTest {
    @Test
    public void isValidOperation()
    {
        MathSubtraction sub = new MathSubtractionApplication();
        // some test to sub operation
        assertEquals(-1.0, sub.action(1, 2));
        assertEquals(-2.0, sub.action(2, 4));
        assertEquals(-11.0, sub.action(-10, 1));
    }
}
