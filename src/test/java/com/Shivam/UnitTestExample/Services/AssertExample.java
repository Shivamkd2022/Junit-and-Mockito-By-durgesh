package com.Shivam.UnitTestExample.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample
{
    //Assertion - validating actual result with expected result.
    @Test
    public void test1()
    {
        System.out.println("Testing of some assertions method");
        int actual=11;
        Integer expected=11;
        int[] actualArray= {3,4,5};
        int[] expecteArray={3,4,5};
        //overloading
        Assertions.assertEquals(expected,actual);
        Assertions.assertArrayEquals(actualArray,expecteArray);

        String actualName=new String("Rakesh");
        String expectedName= new String("Rakesh");
        Assertions.assertSame(expectedName,actualName);
        Assertions.assertNotSame(expectedName,actualName);
        Assertions.assertNotNull(expectedName);
        Assertions.assertEquals(expectedName,actualName);

    }
    @Test

    public void test2()
    {
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
        List<Integer>list2=Arrays.asList(1,2,3,4,5,69);
        Assertions.assertIterableEquals(list1,list2);
    }
    @Test
    public void test3()
    {
        int a=4;
        int b=0;

        Assertions.assertThrows(ArithmeticException.class,()-> { int res = a/b;});
    }

}
