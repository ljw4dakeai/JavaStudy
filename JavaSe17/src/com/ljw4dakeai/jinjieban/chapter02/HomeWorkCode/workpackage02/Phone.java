package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage02;


/**
 * @author ZJH
 * @info
 *
1.定义手机类作为父类
行为:
打电话

			发短信

2.定义接口IPlay
行为:
玩游戏

3.定义旧手机类继承手机类
行为:
打电话：输出语句普通的打电话功能

			发短信：输出语句	普通的发短信功能

4.定义新手机继承手机类，并实现IPlay接口
行为:

			打电话：输出语句新手机视频通话

			发短信：输出语句新手机发送语音和图片

			玩游戏：输出语句新手机可以玩游戏
 */
public abstract class Phone {
    /**
     * 为手机实现打电话功能
     */
    public abstract void call();

    /**
     * 为手机实现发信息功能
     */
    public abstract void seedMessage();
}
