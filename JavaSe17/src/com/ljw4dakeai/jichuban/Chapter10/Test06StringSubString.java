package com.ljw4dakeai.jichuban.Chapter10;

/**
 * @author ZJH
 * @info
 */
public class Test06StringSubString {
    public static void main(String[] args) {
        String zoujiahao = "ZOUJIAHAO";
        String substring = zoujiahao.substring(3); //去除前面三位
        String substring_ = zoujiahao.substring(4, 5);//取第4到第五位,包头不包尾巴
        System.out.println(substring);
        System.out.println(substring_);

        System.out.println(getPhoneNumber("13197151400", 3, 4));
    }


    public static String getPhoneNumber(String phoneNumber, int start, int end) {
        String startNum = null;
        String endNum = null;
        if (start + end >= 11) {
            System.out.println("电话号码裁剪不符合规则!");
        } else {
            startNum = phoneNumber.substring(0, start);
            endNum = phoneNumber.substring(phoneNumber.length() -end);
        }

        return startNum + "****"+ endNum;
    }
}
