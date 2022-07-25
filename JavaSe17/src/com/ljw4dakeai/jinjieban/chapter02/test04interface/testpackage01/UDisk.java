package com.ljw4dakeai.jinjieban.chapter02.test04interface.testpackage01;

/**
 * @author ZJH
 */
public class UDisk implements USB {
    @Override
    public void check() {
        System.out.println("U盘电源检查!");
    }

    @Override
    public void loadDriver() {
        System.out.println("U盘驱动加载!");
    }

    @Override
    public void run() {

        System.out.println("U盘运行!");
    }
}
