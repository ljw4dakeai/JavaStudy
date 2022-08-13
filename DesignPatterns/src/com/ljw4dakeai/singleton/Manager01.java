package com.ljw4dakeai.singleton;

/**
 * @author ZJH
 * 饿汉
 * 类 加载到内存以后, 就会实例化一个对象, JVN保证线程安全
 * 推荐使用
 * 自己写的单例会非常少, 直接交给spring的been工厂 接口 实现一个
 */
public class Manager01 {
    private Manager01() {
    }

    private static final Manager01 INSTANCE = new Manager01();

    public static Manager01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Manager01.getInstance().hashCode());
            }).start();
        }
    }
}
