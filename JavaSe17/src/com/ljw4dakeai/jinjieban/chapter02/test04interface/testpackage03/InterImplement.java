package com.ljw4dakeai.jinjieban.chapter02.test04interface.testpackage03;

/**
 * @author ZJH
 */
public class InterImplement  implements Inter{

    @Override
    public void interOne() {
        System.out.println("我是重写的接口的抽象方法");
    }

    @Override
    public void interTwo() {
        Inter.super.interTwo();
        System.out.println("我是重写的接口的默认方法");
    }
}
