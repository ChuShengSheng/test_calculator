package org.example;


import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

    private Calculator calc = new Calculator();

    @Test
    public void add() {
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void sub() {
        int result = calc.sub(10, 10);
        assertEquals(0, result);
    }

    @Test
    public void mul() {
        int result = calc.mul(-5, -3);
        assertEquals(15, result);
    }

    @Test
    public void div() {
        int result = calc.div(2, 3);
        assertEquals(0, result);
    }
}
