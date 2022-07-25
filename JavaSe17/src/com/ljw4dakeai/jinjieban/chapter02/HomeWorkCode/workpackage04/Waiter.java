package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage04;

/**
 * @author ZJH
 */
public class Waiter extends Employee {

    public Waiter() {
    }

    public Waiter(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println(getName() + "是服务员,服务客人!");
    }
}
