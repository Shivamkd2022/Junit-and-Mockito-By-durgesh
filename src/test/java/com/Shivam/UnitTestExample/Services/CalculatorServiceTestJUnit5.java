package com.Shivam.UnitTestExample.Services;

import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorServiceTestJUnit5
{
    @BeforeAll
    public static void init()
    {
        System.out.println("This method is called firstly "+new Date());
    }

    @BeforeEach
    public void beforeEach()
    {
        System.out.println("this test case is executed before each test case");
    }
    @AfterEach
    public void afterEach()
    {
        System.out.println("this test case is executed after each test case");
    }

    @Test
    @DisplayName("this is custom name")
    public void addTwoNumTest()
    {
        System.out.println("add two num test case is executed");
        int result = CalculatorService.addTwoNum(33,44);
        int expected=77;
        Assertions.assertEquals(expected,result);
    }

    @Test
    @Disabled
    public void productTwoNumTest()
    {
        System.out.println("product two num test case is executed");
        int result = CalculatorService.productTwoNum(4, 15);
        int expected=60;
        Assertions.assertEquals(expected,result);
    }
     @AfterAll
    public static void cleanUp()
    {
        System.out.println("this method is called at most last");
    }
}
