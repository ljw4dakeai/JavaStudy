package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage03;

/**
 * @author ZJH
 */
public class UsbMouse implements USB{
    private String name;

    public UsbMouse(String name) {
        this.name = name;
    }

    public UsbMouse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UsbMouse{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void into() {
        System.out.println("USB鼠标" + getName() + "插入!");
    }

    @Override
    public void out() {
        System.out.println("USB鼠标" + getName() + "拔出");
    }

    public void click(){
        System.out.println("USB鼠标" + getName() + "点击!");
    }
}
