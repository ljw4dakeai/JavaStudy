package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage04;

/**
 * @author ZJH
 */
public class Rectangle  extends Shape{
    private final int height;
    private final int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double perimeter() {
        return (height + weight) * 2;
    }

    @Override
    public double area() {
        return height * weight;
    }
}
