package com.ljw4dakeai.jinjieban.chapter03.HomeWorkCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * @author ZJH
 */
public class WorkOne {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        String birthday = "2001-11-20 06:20:15";
        Date birthdayDate = simpleDateFormat.parse(birthday);
        Duration between = Duration.between(birthdayDate.toInstant(), date.toInstant());
        System.out.println(between.toDays());
    }
}
