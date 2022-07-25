package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage04;

/**
 * @author ZJH
 */
public class Triangle extends Shape {
    private final int right;
    private final int left;
    private final int down;
    private final int high;

    public Triangle(int right, int left, int down, int high) {
        this.right = right;
        this.left = left;
        this.down = down;
        this.high = high;
    }

    @Override
    public double perimeter() {
        double perimeter;
        if(right + left <= down || right + down <= left || left + down <= right ){
            perimeter = 0;
            System.out.println("三角形构建错误!");
        }else {
            perimeter = right + left + down;
        }

        return perimeter;
    }

    @Override
    public double area() {
        double area;
        if(right + left <= down || right + down <= left || left + down <= right ){
            area = 0;
            System.out.println("三角形构建错误!");
        }else {
            area =(down * high) / 2.0 ;
        }

        return area;
    }
}
