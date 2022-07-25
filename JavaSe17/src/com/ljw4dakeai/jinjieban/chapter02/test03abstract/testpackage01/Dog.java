package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage01;


/**
 * @author ZJH
 * @info
 * 子类继承抽象类,需要重写抽象方法!
 */
public class Dog extends  Animal{
    @Override
    public void run() {
        System.out.println("小狗在愉快的狗刨!");
    }

    @Override
    public void sleep() {
        System.out.println("小狗在香香的睡觉!");
    }
}
