package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage05;

/**
 * @author ZJH
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animalDog = new DrugsDog();
        Drugs drugsDog = new DrugsDog();

        animalDog.bellow();
        System.out.println("-----------------------------");
        drugsDog.drugs();
        System.out.println("-----------------------------");
        ((DrugsDog)drugsDog).eat();
        ((DrugsDog)drugsDog).bellow();
        ((DrugsDog)drugsDog).drugs();

    }
}
