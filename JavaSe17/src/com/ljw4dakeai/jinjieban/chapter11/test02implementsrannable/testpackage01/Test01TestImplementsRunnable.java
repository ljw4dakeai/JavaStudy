package com.ljw4dakeai.jinjieban.chapter11.test02implementsrannable.testpackage01;

/**
 * @author ZJH
 */
public class Test01TestImplementsRunnable implements Runnable {
    @Override
    public void run() {
        //模拟下载进度
        for (int i = 1; i <= 100; i++) {
            //获取线程名称
            System.out.println(Thread.currentThread().getName() + "线程中文件已经下载" + i + "%");
        }

    }

    public static void main(String[] args) {
        //t通过任务对象创建线程对象
        Thread threadOne = new Thread(new Test01TestImplementsRunnable(), "西游记");
        threadOne.start();
        Thread threadTwo = new Thread(new Test01TestImplementsRunnable(), "红楼梦");
        threadTwo.start();

    }
}
