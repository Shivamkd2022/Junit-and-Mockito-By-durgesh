package com.Shivam.UnitTestExample.Services;

public class CalculatorService
{
    public static int addTwoNum(int a, int b){
     return a+b;
    }
    public static int productTwoNum(int a, int b){
    return a*b;

    }
    public static double divideTwoNo(int a, int b)
    {
    return a/b;
    }
    public static int sumAnyNum (int ...num)
    {
        int sum=0;
        for (int x:num) {
            sum=sum+x;
        }
        return sum;
    }
}
