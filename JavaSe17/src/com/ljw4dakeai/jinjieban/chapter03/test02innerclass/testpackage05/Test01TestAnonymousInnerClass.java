package com.ljw4dakeai.jinjieban.chapter03.test02innerclass.testpackage05;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author ZJH
 */
public class Test01TestAnonymousInnerClass {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("这是一个匿名内部类重写的eat方法!");
            }
        };
        animal.eat();


        new Animal() {

            @Override
            public void eat() {
                System.out.println("不实现变量名调用eat方法!");
            }
        }.eat();

        System.out.println("------------------------------------------");

        LambdaInnerOne lambdaInnerOne = new LambdaInnerOne() {
            @Override
            public void show() {
                System.out.println("接口的匿名内部类的实现");
            }
        };

        lambdaInnerOne.show();


        new LambdaInnerOne() {
            @Override
            public void show() {
                System.out.println("接口不实现变量名调用show方法");
            }
        }.show();


        System.out.println("------------------------------------------");
        LambdaInnerOne lambdaInnerLambdaOne = () -> System.out.println("lambda实现调用show方法");
        lambdaInnerLambdaOne.show();


        System.out.println("------------------------------------------");
        LambdaInnerTwo lambdaInnerTwo = (name) -> System.out.println("有参数" + name);
        lambdaInnerTwo.show("邹家豪");

        System.out.println("------------------------------------------");


        //如果一个接口中有多个抽象方法  就没办法使用lambda表达式!
        //但是可以使用匿名内部类实现
        LambdaInnerThree lambdaInnerThree = new LambdaInnerThree() {

            @Override
            public void eat(String name) {
                System.out.println(name + "正在干饭!");
            }

            @Override
            public void sleep() {
                System.out.println("滚去睡觉!");
            }

            @Override
            public String study(int number) {
                return new String(String.valueOf(number));
            }
        };



        System.out.println("------------------------------------------");

        ArrayList<String> strings = new ArrayList<>();

        strings.add("邹家豪");
        strings.add("李静雯");
        strings.add("大可爱");

        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        System.out.println("------------------------------------------");
        strings.forEach((value) -> System.out.println(value));
        System.out.println("------------------------------------------");
        strings.forEach(System.out :: println);



    }
}
