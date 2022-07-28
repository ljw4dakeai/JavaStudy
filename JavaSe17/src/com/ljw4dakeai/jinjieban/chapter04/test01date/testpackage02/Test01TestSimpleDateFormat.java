package com.ljw4dakeai.jinjieban.chapter04.test01date.testpackage02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZJH
 */
public class Test01TestSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //Date对象 -> 格式化时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = simpleDateFormat.format(new Date());
        System.out.println(formatDate);

        System.out.println(simpleDateFormat.parse(simpleDateFormat.format(Long.MAX_VALUE)));

        //格式化时间 -> Date对象
        String date = "2001-11-20 06:00:20";
        Date parseDate = simpleDateFormat.parse(date);
        System.out.println(parseDate);


        String newDate = "2001年11月20日 上午09时45分20秒";
        Date newParseDate = new SimpleDateFormat("yyyy年MM月dd日 上午HH时mm分ss秒").parse(newDate);
        System.out.println(newParseDate);



    }
}
