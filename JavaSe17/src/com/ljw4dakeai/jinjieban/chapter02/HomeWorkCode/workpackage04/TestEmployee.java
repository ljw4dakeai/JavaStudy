package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage04;

/**
 * @author ZJH
 */
public class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager(10086, "邹家豪", 5000);

        manager.work();

        Waiter waiter = new Waiter(10010, "zoujiahao");

        waiter.work();
    }
}
