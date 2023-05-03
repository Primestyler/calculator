package com.example.slmcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private CalculatorController calculatorController=
            new CalculatorController();

    @Test
    public void sumTest1(){
        //Arrange
        int a=6;
        int b=11;
        //Act
        int result= calculatorController.sum(a,b);

        //Assert
        assertEquals(17,result);
    }
    @Test
    public void sumTest2(){
        int a=-2;
        int b=-4;

        int result= calculatorController.sum(a,b);

        assertEquals(-6,result);
    }
}