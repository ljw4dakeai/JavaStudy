package com.ljw4dakeai.jinjieban.chapter02.test04interface.testpackage02;

/**
 * @author ZJH
 * @info 类只能单继承
 */
public class Father extends GrandFather implements InterOne , InterTwo{
    @Override
    public void grandfatherMethod() {
        System.out.println("这是抽象类的方法重写!");
    }

    @Override
    public void interOne() {

        System.out.println("这是接口一的方法重写!");
    }

    @Override
    public void interTwo() {
        System.out.println("这是接口二的方法重写!");

    }
}
