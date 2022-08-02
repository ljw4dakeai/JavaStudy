package com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01;

import java.text.SimpleDateFormat;

/**
 * @author ZJH
 * @info 运行时异常
 */
public class Test01TestRunTimeException {
    public static void main(String[] args) {
        //运行时异常
        //.Test01TestRunTimeException
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        //	at com.ljw4dakeai.jinjieban.chapter07.test03exception.testpackage01.Test01TestRunTimeException.main(Test01TestRunTimeException.java:10)
        int[] ints = new int[3];
        System.out.println(ints[10]);

//        //编译时异常
//        //java: 未报告的异常错误java.text.ParseException; 必须对其进行捕获或声明以便抛出
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        simpleDateFormat.parse("2001年11月20日");

    }
}
