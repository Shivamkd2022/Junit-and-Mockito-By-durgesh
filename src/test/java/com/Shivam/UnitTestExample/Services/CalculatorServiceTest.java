package com.Shivam.UnitTestExample.Services;


import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest
{

    @BeforeClass
    public static void init()
    {
        System.out.println("Before all test cases");
        System.out.println("started test  @  "+ new Date());
    }
    // testing of addTwoNum method

    @Test
    public void addTwoNumTest()
    {
        System.out.println("AddTwoNumTest is executed");
        int result = CalculatorService.addTwoNum(12, 43);
        int expected=55;
        Assert.assertEquals(expected, result);

        //actural result
        // expected result
    }

    @Test
    public void sumAnyNumTest()
    {
        System.out.println("sumAnyNumTest is executed");
        int result = CalculatorService.sumAnyNum(10, 2, 4, 5, 8, 9);
        int expected=38;
        Assert.assertEquals(expected,result);
    }

    @AfterClass
    public static void cleanUp()
    {
        System.out.println("After all test cases");
        System.out.println("end of test cases .. @ "+new Date());
    }

    @Before
    public void beforeEach()
    {
        System.out.println("this test case is executed before each of test");
    }

    @After
    public void afterEach()
    {
        System.out.println("this test case is executed after each of test");
    }
}
