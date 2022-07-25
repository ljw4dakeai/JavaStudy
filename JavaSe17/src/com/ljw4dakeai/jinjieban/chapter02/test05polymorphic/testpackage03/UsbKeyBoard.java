package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage03;

/**
 * @author ZJH
 */
public class UsbKeyBoard implements USB {

    private String name;

    public UsbKeyBoard() {
    }

    public UsbKeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UsbKeyBoard{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void into() {
        System.out.println("USB键盘" + getName() + "插入!");
    }

    @Override
    public void out() {
        System.out.println("USB键盘" + getName() + "拔出");
    }

    public void writeWord() {
        System.out.println("USB键盘" + getName() + "打字!");
    }
}
