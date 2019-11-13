package date;

import java.util.*;

public class MyMap {
public static void main(String[]args)
{
    Map<String,String> myMap = new HashMap<>();
    myMap.put("Name","smita");
    myMap.put("Name","Krutika");
    myMap.put("City","Pune");
    Set<String> keys=myMap.keySet();
    for(String key:keys) {
        System.out.println(key + ":" + myMap.get(key));
    }
    Set<Map.Entry<String,String>> entries=myMap.entrySet();
    for (Map.Entry<String, String> entry : entries) {
        System.out.println(entry.getKey()+":"+entry.getValue());
    }
    Collection<String>myValues =myMap.values();
    for(String mapValue:myValues)
    {
        System.out.println(mapValue);
    }
}
}
