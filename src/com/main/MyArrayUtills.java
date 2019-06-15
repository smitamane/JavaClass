package com.main;

public class MyArrayUtills {
    public int[] concatArray(int[] number1, int[] number2)
    {

        int [] concatinatednumber=new int[number1.length+number2.length] ;
        //int count=0;

        for (int i=0;i<number1.length;i++)
        {
            concatinatednumber[i] = number1[i];
            //count++;
        }
        for(int j=0; j<number2.length;j++)
        {
            concatinatednumber[number1.length+j] = number2[j];
        }
        return concatinatednumber;

    }
}
