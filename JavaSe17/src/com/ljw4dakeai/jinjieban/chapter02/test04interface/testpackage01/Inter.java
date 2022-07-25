package com.ljw4dakeai.jinjieban.chapter02.test04interface.testpackage01;

/**
 * @author ZJH
 */
public interface Inter {
    /**
     *  接口定义变量其实是常量 默认被public static final修饰
     */
    public static final int NUM = 20;
    int INT = 20;

    /**
     * 默认都是抽象方法, 都被public abstract修饰
     */
    public abstract void show();
}
