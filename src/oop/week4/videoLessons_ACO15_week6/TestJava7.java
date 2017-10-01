package oop.week4.videoLessons_ACO15_week6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestJava7 {

    public static void main(String[] args) {

        // JodaTime -> Java8

        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date);

        String format = String.format("year %1$ty, month %1$tm, day %1$td", date);
        System.out.println(format);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try{
            Date date1 = simpleDateFormat.parse("1982-12-16");
        }catch (ParseException e){
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar(1, 11, 12);
        Date fromCalendar = calendar.getTime();
        int month =  calendar.get(Calendar.MONTH);

        calendar.setTime(date);

    }

}
