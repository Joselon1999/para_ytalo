package com.example.ytalo.Configuration;

import java.util.Calendar;
import java.util.Date;

public class CustomDate {
    public static Date customFormat(Date date, int hours){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }
}
