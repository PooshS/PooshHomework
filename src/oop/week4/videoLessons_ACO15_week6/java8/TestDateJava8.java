package oop.week4.videoLessons_ACO15_week6.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TestDateJava8 {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(1990,10,05);
        LocalDate localDate2 = LocalDate.now();

        localDate1.get(ChronoField.DAY_OF_MONTH);


    }

}
