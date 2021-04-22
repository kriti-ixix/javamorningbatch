import java.util.*;
import java.time.*;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

class TimeDiff 
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 1);
        Date lDate = cal.getTime(); //Feb 15
        Calendar cCal = Calendar.getInstance();
        Date cDate = new Date(); //April 15

        long diff = cal.getTime().getTime() - cCal.getTime().getTime();
        long x = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        System.out.println(x);
        
        //Epoch seconds
        /*
        if (cDate.compareTo(lDate) > 0)
        {
            System.out.println("Current date is bigger");
        }*/
    }    
}
