package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FirstandlastDateofMonth {
    public static void main(String[]args)throws ParseException
    {
        System.out.println(firstLastDate("12/22/2019","11/12/2312"));
    }
    public static String firstLastDate(String startdate,String enddate) throws ParseException {
      GregorianCalendar f1 = new GregorianCalendar();
        Date d1=new SimpleDateFormat("dd/mm/2019").parse(startdate);
        f1.add(Calendar.MONTH,+1);
       d1=f1.getTime();
       f1.setTime(d1);

        System.out.println(d1);
        return startdate;
    }
}