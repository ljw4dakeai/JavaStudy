package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage02;

public class NewPhone extends Phone implements IPlay{
    @Override
    public void playGame() {
        System.out.println("新手机可以打游戏!");
    }

    @Override
    public void call() {

        System.out.println("新手机可以打视频电话!");
    }

    @Override
    public void seedMessage() {

        System.out.println("新手机可以发彩信!");
    }
}
