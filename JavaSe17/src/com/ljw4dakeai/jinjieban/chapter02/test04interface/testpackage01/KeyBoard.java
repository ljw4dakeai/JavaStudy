package com.ljw4dakeai.jinjieban.chapter02.test04interface.testpackage01;

public class KeyBoard implements Click, USB{
    @Override
    public void click() {
        System.out.println("键盘点击!");
    }

    @Override
    public void check() {

        System.out.println("键盘电源检查!");
    }

    @Override
    public void loadDriver() {

        System.out.println("键盘加载驱动!");
    }

    @Override
    public void run() {

        System.out.println("键盘运行!");
    }
}
