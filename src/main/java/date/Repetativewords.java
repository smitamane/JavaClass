package date;

import java.util.ArrayList;
import java.util.List;

public class Repetativewords {

    public static void main(String []args)
    {
        List<String> sentence=new ArrayList<>();
        sentence.add("And");
        sentence.add("India and Functional countries and ");
        sentence.add("India");
        System.out.println(sentence);
        List<String> uniquewordsentence =new ArrayList<>();
        for(int i=0;i<sentence.size();i++)
        {
            for (int j = 0; j < sentence.size(); j++)
            {
                if (i == j)
                {
                    System.out.println(sentence.remove(i));
                }
            }
        }
       // System.out.println(sentence.get(sentence));
    }
}
