package com.ljw4dakeai.jinjieban.chapter03.HomeWorkCode;

import java.util.Calendar;

/**
 * @author ZJH
 */
public class WorkThree {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_YEAR, 500);

        System.out.println("当前时间相加500天后的时间 是 : " +
                instance.get(Calendar.YEAR) + "年" +
                (instance.get(Calendar.MONTH) + 1) + "月" +
                instance.get(Calendar.DAY_OF_MONTH) + "日"
        );
    }
}
