package com.main;
public class Main {

public  static void main(String []args)
    {
        int []number1=new int [] {123,23,45,56,76,77,56};
        int []number2=new int []{77,56,23,45};
        MyArrayUtills myArrayUtills = new MyArrayUtills();
        int[] result = myArrayUtills.concatArray(number1,number2);
        for (int i : result) {
            System.out.println(i);
        }

    }

}
