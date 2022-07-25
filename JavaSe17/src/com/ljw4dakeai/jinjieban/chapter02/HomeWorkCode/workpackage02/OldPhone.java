package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage02;

/**
 * @author ZJH
 */
public class OldPhone extends Phone{
    @Override
    public void call() {
        System.out.println("旧手机可以打电话!");
    }

    @Override
    public void seedMessage() {
        System.out.println("旧手机可以发消息!");
    }
}
