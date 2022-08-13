package com.ljw4dakeai.jinjieban.practice.practice0802;

import java.sql.SQLOutput;
import java.util.Random;

/**
 * @author ZJH
 * @info
 * 写一个方法，随机产生一个长度为5的字符串，字符串由任意字母或数字组合而成，并在测试类中测试
 */
public class PracticeThree {
    public static void main(String[] args) {
        System.out.println(getRandomString(10));
    }

    public static String getRandomString(int length){
        Random random = new Random();
        String nums = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        System.out.println(nums.length());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(nums.charAt(random.nextInt(nums.length())));
        }
        return stringBuilder.toString();
    }
}
