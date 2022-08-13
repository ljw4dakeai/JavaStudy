package com.ljw4dakeai.singleton;

/**
 * @author ZJH
 * @info 懒汉式
 * 理想情况下 为空就创建, 但是线程会被其他线程打断, 线程不安全
 */
public class Manager03 {
    private Manager03() {
    }

    private static Manager03 INSTANCE;

    public static Manager03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Manager03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager03.getInstance().hashCode());
            }).start();
        }
    }

}
