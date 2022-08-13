package com.ljw4dakeai.jinjieban.chapter11.test01extendsthread.testpackage01;

/**
 * @author ZJH
 */
public class Test01TestExtendsThread  extends  Thread{
    @Override
    public void run() {
        //模拟下载进度
        for (int i = 1; i <= 100; i++) {
            //获取线程名称
            System.out.println(getName() + "线程中文件已经下载" + i + "%");
        }
    }

    public static void main(String[] args) {
        Test01TestExtendsThread threadOne = new Test01TestExtendsThread();
        threadOne.start();
        Test01TestExtendsThread threadTwo = new Test01TestExtendsThread();
        threadTwo.start();

    }
}
