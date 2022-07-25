package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage02;

/**
 * @author ZJH
 */
public class SilverCard extends Card {
    public SilverCard() {
    }

    public SilverCard(String name, double money) {
        super(name, money);
    }

    private static final double DISCOUNT = 0.85;

    @Override
    public void pay(int money) {
        double actualMoney = money * DISCOUNT;
        if (getMoney() >= actualMoney) {
            setMoney(getMoney() - actualMoney);
            System.out.println("尊敬的银卡用户 " + getName() + "你好!当前扣费:" + actualMoney + "元!当前余额为" + getMoney() + "元");
        } else {
            System.out.println("尊敬的银卡用户 " + getName() + "你好!当前扣费:" + actualMoney  + "元!你的卡上余额不足, 当前余额为 : " + getMoney() + "元");
        }
    }
}
