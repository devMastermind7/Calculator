package com.Calculator;

import org.junit.Test;

import com.calculator.Calculator;

import org.junit.Assert;
import org.junit.Before;


public class Calculator_test {

    private Calculator calc;

    @Before
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void addTest() {
        float op1 = 10;
        float op2 = 40;
        float expResult = 50;
        float result = calc.addition(op1, op2);
        Assert.assertEquals(expResult, result, 0);
    }
}
