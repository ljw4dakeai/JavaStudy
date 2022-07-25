package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage02;


/**
 * @author ZJH
 */
public class Test01TestPolymorphic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig = new Pig();

        Feeder.feed(dog);
        Feeder.feed(cat);
        Feeder.feed(pig);




    }
}
