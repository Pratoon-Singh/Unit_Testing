package com.unit.testing.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceJunit5 {

    @Test
    public void addTwoNumberTest(){
        int actualResult = CalculatorService.addTwoNumber(12, 6);
        int expected = 18;
        Assertions.assertEquals(expected,actualResult,"Test Failed !");
        System.out.println("Test passed for addTwoNumberTest  ");
    }

    @Test
    public void multiplyTwoNumberTest(){
        int actualResult = CalculatorService.multiplyTwoNumber(12, 6);
        int expected = 72;
        Assertions.assertEquals(expected,actualResult,"Test Failed !");
        System.out.println("Test passed for multiplyTwoNumberTest");
    }
    @Test
    public void divideTwoNumberTest(){
        double actualResult = CalculatorService.divideTwoNumber(12, 6);
        int expected = 2;
        Assertions.assertEquals(expected,actualResult,0.0,"Test Failed !");
        System.out.println("Test passed for divideTwoNumberTest");
    }
    @Test
    public void sumNumberTest(){
        int actualResult = CalculatorService.sumNumbers(12, 6,34,54);
        int expected = 106;
        Assertions.assertEquals(expected,actualResult,"Test Failed !");
        System.out.println("Test passed for sumNumberTest");
    }
}

