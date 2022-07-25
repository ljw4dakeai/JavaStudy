package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage05;

/**
 * @author ZJH
 */
public class DrugsDog extends Animal implements Drugs{
    @Override
    public void bellow() {
        System.out.println("小狗汪汪叫");
    }

    @Override
    public void eat() {

        System.out.println("小狗啃骨头!");
    }

    @Override
    public void drugs() {

        System.out.println("小狗找毒品!");
    }
}
