package com.ljw4dakeai.jinjieban.chapter04.test06regex.testpackage01;

import java.util.regex.Pattern;

/**
 * @author ZJH
 */
public class Test01TestRegex {
    public static void main(String[] args) {
        System.out.println(checkQqNum("2631247954"));
        System.out.println(checkQqNumRegex("2631247954"));
        System.out.println(checkPhoneNum("13197151400"));
        System.out.println(checkEmail("2631247954@qq.com"));
    }


    public static boolean checkQqNum(String qqNum){
        if(qqNum.length() < 6 || qqNum.length() > 20){
            return  false;
        }
        for (int i = 0; i < qqNum.length(); i++) {
            if(qqNum.charAt(i) <'0' || qqNum.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }


    public static boolean checkQqNumRegex(String qqNum){
        return  qqNum.matches("[0-9]{10,20}");
    }


    public static boolean checkPhoneNum(String phoneNum){
        return phoneNum.matches("[1][0-9]{10}");
    }
    public static boolean checkEmail(String email){

        // [英文字符,下划线,数字]@[英文字符,下划线,数字][多个.com.cn]

        return email.matches("\\w+[@]\\w+([\\.]\\w+)+");
    }

}
