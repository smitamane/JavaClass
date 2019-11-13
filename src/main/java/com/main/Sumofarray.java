package com.main;

public class Sumofarray {
    public int testsumodarray(int [] number1)
    {
       // int []numbers=new int [] {3,3,8,6};
        int sum =0;
        for(int i=0;i<number1.length;i++)
        {
             sum=sum + number1[i];
        }
        System.out.println("Total of numbers in array is "+ sum);
        return sum;
    }

}
