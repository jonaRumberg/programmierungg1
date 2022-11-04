package Aufgaben.Aufgabenblatt3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Aufgabe10 {
    public static void main(String[] args) throws ParseException {
        String s = "2020-10-20";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(s);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }
   
    
}
