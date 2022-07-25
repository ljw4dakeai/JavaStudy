package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage02;

/**
 * @author ZJH
 */
public class Feeder {
    //多态的实现!
    public static void feed(Animal animal) {
        animal.eat();

//        强制类型转化, 向下转型
//        当传入的是一个狗时animal 是一个狗 转换猫失败 ,类型转换异常
//        当传入的是一个猫时animal 是一个猫 转换狗失败, 类型转化异常
//        Dog dog= (Dog) animal;
//        dog.lookHome();
//        Cat cat = (Cat) animal
//        cat.catchMouse();

        if (animal instanceof Dog) {
            ((Dog) animal).lookHome();
        }
        if (animal instanceof Cat) {
            ((Cat) animal).catchMouse();
        }
    }

//    public static void feed(Dog dog){
//        dog.eat();
//    }
//    public static void feed(Cat cat){
//        cat.eat();
//    }

}
