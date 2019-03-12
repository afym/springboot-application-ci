package com.application.application.v1.test;

import com.application.application.v1.MathMultiplicationApplication;
import com.application.service.v1.MathMultiplication;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MathMultiplicationApplicationTest {
    @Test
    public void isValidOperation()
    {
        MathMultiplication mul = new MathMultiplicationApplication();
        // some test to mul operation
        assertEquals(2.0, mul.action(1, 2));
        assertEquals(8.0, mul.action(2, 4));
        assertEquals(-10.0, mul.action(-10, 1));
    }
}
