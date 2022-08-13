package com.ljw4dakeai.singleton;

/**
 * @author ZJH
 * 饿汉式, 静态代码块实现
 */
public class Manager02 {
    private Manager02() {
    }
    private static final Manager02 INSTANCE;
    static {
        INSTANCE = new Manager02();
    }

    public static Manager02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager02.getInstance().hashCode());
            }).start();
        }

    }
}
