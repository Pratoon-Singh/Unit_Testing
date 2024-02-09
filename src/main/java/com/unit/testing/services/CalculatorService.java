package com.unit.testing.services;

public class CalculatorService {

    public static int addTwoNumber(int num1, int num2){
        return num1+num2;
    }

    public static int multiplyTwoNumber(int num1, int num2){

        return num1*num2;
    }

    public static double divideTwoNumber(int num1, int num2){

        return (double) num1 /num2;
    }

    public static int sumNumbers(int ...numbers){
        int s = 0;
        for (int n:numbers){
            s+=n;
        }
        return s;
    }

}
