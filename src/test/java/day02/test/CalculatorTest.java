package day02.test;

import day02.solved.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAddIntegers() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAddDoubles() {
        Calculator calc = new Calculator();
        double result = calc.add(2.5, 3.7);
        Assertions.assertEquals(6.2, result, 0.001);
    }

    @Test
    public void testAddFloats() {
        Calculator calc = new Calculator();
        float result = (float) calc.add(2.5f, 3.7f);
        Assertions.assertEquals(6.2f, result, 0.001);
    }

    @Test
    public void testAddStrings() {
        Calculator calc = new Calculator();
        String result = calc.add("Hello", "World");
        Assertions.assertEquals("HelloWorld", result);
    }
}
