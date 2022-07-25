package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage01;

/**
 * @author ZJH
 * @info
 * 抽象类和抽象方法 都被abstract修饰
 * 特点 :1、 没有方法体
 *          2、不能创建对象
 *          3、继承的实现类必须实现抽象方法
 *          4、有抽象方法必须是抽象类
 */
public abstract  class Animal {
    /**
     * 为动物实现run方法
     */
    public abstract void run();

    /**
     * 实现睡觉方法
     */
    public abstract void sleep();
}
