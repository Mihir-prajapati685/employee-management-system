package com.example.utils;

import java.util.Date;

public class DateUtils {

    public static Date getTimeStamp(Long timeStamp){
       Date date = null;
        if(timeStamp != null){
           date = new Date(timeStamp);
       }
        return date;
    }
    public static Date getNowInDate() {
        return getTimeStamp(System.currentTimeMillis());
    }
}