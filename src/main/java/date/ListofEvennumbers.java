package date;

import java.util.*;

public class ListofEvennumbers {
    public static void main(String [] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
            System.out.println(i);
        }
            List<Integer> Evennumbers=new ArrayList<>();
            Iterator <Integer> numberseven=numbers.iterator();
            while(numberseven.hasNext())
            {
                Integer num=numberseven.next();
                if(num%2==0)
                {
                    Evennumbers.add(num);
                    System.out.println("List of Even Numbers"+num);
                }
            }

        }

    }
