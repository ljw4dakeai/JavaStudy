package com.ljw4dakeai.singleton;

/**
 * @author ZJH
 * 痴心妄想的实现 不能实现单例子设计模式
 */
public class Manager05 {
    private Manager05() {
    }

    private static Manager05 INSTANCE;

    public static Manager05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Manager05.class) {
                INSTANCE = new Manager05();
            }
        }
        return  INSTANCE;
    }
}
