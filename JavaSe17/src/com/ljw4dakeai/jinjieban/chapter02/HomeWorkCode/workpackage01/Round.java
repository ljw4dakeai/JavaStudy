package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage01;

/**
 * @author ZJH
 */
public class Round extends Shape {
    private double r;

    public Round() {
    }

    public Round(double r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return Math.PI * r * 2;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Round{" +
                "r=" + r +
                '}';
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
