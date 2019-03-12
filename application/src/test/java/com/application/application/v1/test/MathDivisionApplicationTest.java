package com.application.application.v1.test;

import com.application.application.v1.MathDivisionApplication;
import com.application.service.v1.MathDivision;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathDivisionApplicationTest {
    @Test
    public void isValidOperation()
    {
        MathDivision div = new MathDivisionApplication();
        // some test to div operation
        assertEquals(0.5, div.action(1, 2));
        assertEquals(0.5, div.action(2, 4));
        assertEquals(-10.0, div.action(-10, 1));
    }
}
