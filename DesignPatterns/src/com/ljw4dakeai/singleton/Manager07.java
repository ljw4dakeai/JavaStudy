package com.ljw4dakeai.singleton;

/**
 * @author ZJH
 * 懒汉式
 *  通过内部类实现懒汉式加载, 并且JVM保证线程安全
 */
public class Manager07 {
    private Manager07(){}

    private static class Manager07Holder{
        private static final Manager07 INSTANCE = new Manager07();
    }

    public static  Manager07 getInstance(){
        return Manager07Holder.INSTANCE;
    }
}
