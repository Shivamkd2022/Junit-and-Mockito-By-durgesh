
package com.Shivam.UnitTestExample.Services;

public class GSTService
{
    public GstProvider gstProvider;
    public GSTService(GstProvider gstProvider) {
        this.gstProvider = gstProvider;
    }

    public int calculateGST()
    {
        System.out.println("Calculating GST");
        int rate =this.gstProvider.getGSTDetail();
        System.out.println("GST rate is: "+ rate);
        return rate;
    }

    public int calculateNewGST()
    {
        System.out.println("Calculating GST");
        int newRate =this.gstProvider.getNewGSTDetail();
        System.out.println(" New GST rate is: "+ newRate);
        return newRate;
    }
}

