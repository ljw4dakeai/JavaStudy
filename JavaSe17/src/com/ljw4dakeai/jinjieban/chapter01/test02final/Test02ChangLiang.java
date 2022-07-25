package com.ljw4dakeai.jinjieban.chapter01.test02final;

/**
 *  @author ZJH
 *  @info java中常量的使用
 *  <p>
 * 命名规则
 * 1、全部字母都大写
 * 2、多个单词之间用下划线分开
 * 3 、常量再产于运算的时候会直接用值替代名称 (编译阶段)
 * <p>
 * 常量的运用
 * 1、在开发中常量用作信息标识符使用
 */
public class Test02ChangLiang {
    public static final double PI = 3.1415926;
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;


    public static void main(String[] args) {
        //求一个圆的面积 PI * R ^ 2
        System.out.println("半径为2的圆的面积是 : " + Math.PI * 2 * 2);
        System.out.println("半径为2的圆的周长是 : " + PI * 2 * 2);
        func(1);
    }

    public static void func(int direction) {
        switch (direction) {
            case UP:
                System.out.println("向上行动!");
                break;
            case DOWN:
                System.out.println("向下行动!");
                break;
            case LEFT:
                System.out.println("向左行动!");
                break;
            case RIGHT:
                System.out.println("向右行动!");
                break;
            default:
                System.out.println("走错了!");
        }
    }
}
