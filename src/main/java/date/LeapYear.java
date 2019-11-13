package date;
import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeapYear {
    public static void main(String[] args) throws ParseException {
        System.out.println(isleapYear("11/04/9090"));
        GregorianCalendar g1=new GregorianCalendar();
        Date d1=new Date();
        g1.setTime(d1);
        g1.add(Calendar.YEAR,-4);
        g1.add(Calendar.MONTH,-2);
        d1 =g1.getTime();
        System.out.println(d1);
    }
    // int year;
    public static boolean isleapYear(String strdate) throws ParseException {
       // SimpleDateFormat df=new SimpleDateFormat("YYYY");
        Date d1=new SimpleDateFormat("dd/mm/yyyy").parse(strdate);
        int year =Integer.parseInt(new SimpleDateFormat("yyyy").format(d1));
        return year%4==0;
    }
}
