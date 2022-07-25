package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage04;

/**
 * @author ZJH
 */
public class Test01TestAbstractShape {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());


        Circle circle = new Circle(10);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());


        Triangle triangle = new Triangle(10, 20, 15, 5);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
    }
}
