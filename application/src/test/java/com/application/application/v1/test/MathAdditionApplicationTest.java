package com.application.application.v1.test;

import com.application.application.v1.MathAdditionApplication;
import com.application.service.v1.MathAddition;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathAdditionApplicationTest {
    @Test
    public void isValidOperation()
    {
        MathAddition add = new MathAdditionApplication();
        // some test to add operation
        assertEquals(3.0, add.action(1, 2));
        assertEquals(7.0, add.action(3, 4));
        assertEquals(-9.0, add.action(10, -19));
    }
}
