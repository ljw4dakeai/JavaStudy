package com.ljw4dakeai.jinjieban.chapter02.test04interface.testpackage02;

/**
 * @author ZJH
 */
public class Son implements InterThree{
    @Override
    public void interOne() {
        System.out.println("这是重写接口三继承接口一的方法!");
    }

    @Override
    public void interTwo() {
        System.out.println("这和是重写接口三继承接口二的方法");
    }
}
