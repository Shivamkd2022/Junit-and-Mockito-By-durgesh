package com.Shivam.UnitTestExample.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GSTServiceTest{

    @Mock
    public GstProvider mockProvider;
    @InjectMocks
    public GSTService gstService;

//    @BeforeEach
//    public void init()
//    {
//        MockitoAnnotations.initMocks(this);
//    }

    //for above we can also use that @ExtendWith(MockitoExtension.class) annotation.
    // then there will be no need of the init() method.

    @Test
    public void getCalculateTest()
    {
//        GstProvider mockProvider = Mockito.mock(GstProvider.class);
//
//        GSTService gstService= new GSTService(mockProvider);

        Mockito.when(mockProvider.getGSTDetail()).thenReturn(18);
        int actualResult = gstService.calculateGST();
        Assertions.assertEquals(18,actualResult);
    }

    @Test
    public void newGstCalculate()
    {
        GstProvider newGstRate = Mockito.mock(GstProvider.class);

        GSTService obj1= new GSTService(newGstRate);

        Mockito.when(newGstRate.getNewGSTDetail()).thenReturn(28);
        int newResult= obj1.calculateNewGST();
        Assertions.assertEquals(28,newResult);

    }

    @Test
    public void copyNewGstCalculate()
    {
        GstProvider newGstRate = Mockito.mock(GstProvider.class);

        GSTService obj1= new GSTService(newGstRate);

        Mockito.when(newGstRate.getNewGSTDetail()).thenReturn(28);
        int newResult= obj1.calculateNewGST();
        Assertions.assertEquals(28,newResult);

    }
}
//class GSTProviderImpl implements GstProvider {
//
//    @Override
//    public int getGSTDetail() {
//        return 18;
//    }
//
//    @Override
//    public int getNewGSTDetail() {
//        return 0;
//    }
//}

