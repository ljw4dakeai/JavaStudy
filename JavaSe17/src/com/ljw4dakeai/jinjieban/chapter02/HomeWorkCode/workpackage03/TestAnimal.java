package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage03;

/**
 * @author ZJH
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.eat();
        dog.eat();

        ((Cat)cat).catchMouse();
        ((Dog)dog).lookHome();
    }
}
