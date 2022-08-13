package com.ljw4dakeai.jinjieban.chapter13.test01junit.testpackage01;

import org.junit.Test;

/**
 * @author ZJH
 * @info
 * junit 必须是无参数, 无返回值的公共的非静态方法
 */
public class Test01TestJunitTest {
    public static boolean Longin(String userName, String passWord){
        String trueUserName = "admin";
        String truePassWord = "123456";
        return trueUserName.equals(userName) && truePassWord.equals(passWord);
    }

    public void run(){
        System.out.println(10/ 0);
    }



}
