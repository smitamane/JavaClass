package com.main;

public class Sumofarray {
    public static void main(String [] args)
    {
        int []numbers=new int [] {3,3,8,6};
        int sum =0;
        for(int i=0;i<numbers.length;i++)
        {
             sum=sum + numbers[i];
        }
        System.out.println("Total of numbers in array is "+ sum);
    }
}
