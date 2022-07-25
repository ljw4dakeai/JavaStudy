package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage04;

/**
 * @author ZJH
 */
public class Circle extends Shape{
    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return Math.PI * r * 2;
    }
}
