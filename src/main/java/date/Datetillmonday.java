package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Datetillmonday {
    public static void main(String[]args) throws ParseException
    {
        Map<String,List<Date>> result = getMondayMonthMap(2018);
    }

    private static Map<String, List<Date>> getMondayMonthMap(int intYear)
    { Calendar myCal=new GregorianCalendar();
    myCal.set(Calendar.YEAR,intYear);
    Map<String,List<Date>> resultMap = new LinkedHashMap<>();
    for(int intMonth =0;intMonth<12;intMonth++)
    {
        List<Date>dateList = new ArrayList<>();
        myCal.set(Calendar.MONTH,intMonth);
        myCal.set(Calendar.DATE,1);
        do{
            dateList.add(myCal.getTime());
            myCal.add(Calendar.DATE,1);

        }while(myCal.get(Calendar.DAY_OF_WEEK)!=3);
        resultMap.put(Months.values()[myCal.get(Calendar.MONTH)].toString(),dateList);

    }
        return resultMap;
    }

}
