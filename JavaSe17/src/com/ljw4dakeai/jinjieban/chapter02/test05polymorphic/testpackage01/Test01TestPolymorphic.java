package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage01;

/**
 * @author ZJH
 */
public class Test01TestPolymorphic {
    public static void main(String[] args) {
        Dog dogOne = new Dog();
        dogOne.sleep();
        dogOne.eat();


        Animal dogTwo = new Dog();
        //无法使用sleep方法
        dogTwo.eat();

        Sleep dogThree = new Dog();
        //无法使用eat方法
        dogThree.sleep();


    }
}
