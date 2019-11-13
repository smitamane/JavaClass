package com.main;

public class CountofrepetaiveCharacter {

    public static void main(String[] args)
    {
        String sentence = "Hellow Friends welcome to India";
        int count = 0;
        for(int i=0;i<sentence.length();i++)
        {
            for(int j=0;j<sentence.length();j++)
            {
                if (sentence.charAt(i)==sentence.charAt(j))
                {
                    count++;
                }
            }
            System.out.println("Character Repeated:"+sentence.charAt(i)+"-"+count);

            count = 0;
        }


    }

}
