package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage01;

public class Rectangle  extends Shape{
    private double length;
    private double high;

    public Rectangle(double length, double high) {
        this.length = length;
        this.high = high;
    }

    public Rectangle() {
    }


    @Override
    public double perimeter() {
        return (high + length) * 2;
    }

    @Override
    public double area() {
        return high * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", high=" + high +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
