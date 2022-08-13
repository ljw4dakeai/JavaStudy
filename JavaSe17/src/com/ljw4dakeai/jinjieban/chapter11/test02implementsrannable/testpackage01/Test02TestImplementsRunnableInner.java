package com.ljw4dakeai.jinjieban.chapter11.test02implementsrannable.testpackage01;

/**
 * @author ZJH
 */
public class Test02TestImplementsRunnableInner {
    public static void main(String[] args) {

        //创建线程, 提交线程, 启动线程, 一步执行
        new Thread(() -> {
            //模拟下载进度
            for (int i = 1; i <= 100; i++) {
                //获取线程名称
                System.out.println(Thread.currentThread().getName() + "线程中文件已经下载" + i + "%");
            }
        }).start();
    }
}
