package com.Shivam.UnitTestExample.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class MockExample
{
    @Mock
    List<Integer> list;
    @Mock
    Map<String,Integer> map;
    @Test
    public void runTest()
    {
        int listExpectedSize=5;
        int valueAtFirstPosition=34;

//        Mockito.when(list.size()).thenReturn(5);
//        Assertions.assertEquals(listExpectedSize,list.size());

        Mockito.when(map.get("first")).thenReturn(34);
        Assertions.assertEquals(valueAtFirstPosition,map.get("first"));
    }
}
