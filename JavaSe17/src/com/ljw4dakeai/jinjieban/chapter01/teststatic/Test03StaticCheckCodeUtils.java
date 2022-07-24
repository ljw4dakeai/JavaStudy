package com.ljw4dakeai.jinjieban.chapter01.teststatic;

import java.util.Random;

/**
 * @author ZJH
 * @info
 * 产生验证码的工具类
 */
public class Test03StaticCheckCodeUtils {
    public static void main(String[] args) {
        System.out.println(CheckCodeUtils.createCheckCode());
    }
}


class CheckCodeUtils{
    private static final String CODE = "0123456789" +
            "qwertyuiopasdfghjklzxcvbnm" +
            "QWERTYUIOPASDFGHJKLZXCVBNM" +
            "~`,<.>/?;:'-=_+!@#$%^&*()";
    public static String createCheckCode(){
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            code.append(CODE.charAt(random.nextInt(CODE.length())));
        }
        return code.toString();
    }

}