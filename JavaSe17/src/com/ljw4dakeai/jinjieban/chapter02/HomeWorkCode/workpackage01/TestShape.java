package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage01;

/**
 * @author ZJH
 */
public class TestShape {
    public static void main(String[] args) {
        Round round = new Round(10);
        System.out.println(round);
        System.out.println(round.area());
        System.out.println(round.perimeter());


        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
