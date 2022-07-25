package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage02;

/**
 * @author ZJH
 */
public abstract class Card {
    private String name;
    private double money;

    public Card() {
    }

    public Card(String name, double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String
    toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public abstract void pay(int money );

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
