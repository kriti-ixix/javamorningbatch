import java.util.*;
import java.text.SimpleDateFormat;

class DateTime 
{
    public static void main(String[] args)  
    {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 1);
        Date date = cal.getTime();


        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        //String d = dateFormat.format(date);
        //System.out.println(d);
        System.out.println(date.toString());
    }  
}
