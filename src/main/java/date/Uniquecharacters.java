package date;
import java.util.*;

public class Uniquecharacters {
    public static void main(String []args)
    {
        String input="helloe india";
        getcharcount(input);
        Map<Character,Integer> resultMap=getcharcount(input);
        Set<Character>keys=resultMap.keySet();
        for(Character key:keys)
        {
            System.out.println(key+":"+resultMap.get(key));
        }
    }

    public static Map<Character,Integer> getcharcount(String input)
    {  Map<Character,Integer> resultMap=new TreeMap<>();
       char[]myChars=input.toLowerCase().toCharArray();
       for(char myChar:myChars) {
           if (resultMap.containsKey(myChar)) {
               int count = resultMap.get(myChar);
               resultMap.put(myChar, ++count);
           } else {
               resultMap.put(myChar, 1);
           }
       }
        return resultMap;
       }
}
