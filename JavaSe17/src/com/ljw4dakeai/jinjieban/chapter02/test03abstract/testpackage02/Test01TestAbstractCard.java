package com.ljw4dakeai.jinjieban.chapter02.test03abstract.testpackage02;

/**
 * @author ZJH
 */
public class Test01TestAbstractCard {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard("邹家豪", 10000);
        goldCard.pay(2000);

        SilverCard silverCard = new SilverCard("邹家豪", 10000);
        silverCard.pay(100860);
    }
}
