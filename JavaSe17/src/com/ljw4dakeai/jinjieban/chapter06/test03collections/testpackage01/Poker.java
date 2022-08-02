package com.ljw4dakeai.jinjieban.chapter06.test03collections.testpackage01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ZJH
 */
public class Poker {

    private String card;
    private int order;

    public Poker(String card, int order) {
        this.card = card;
        this.order = order;
    }

    public Poker() {
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return card;
    }
}


class Test {
    public static void main(String[] args) {
        int order = 0;
        String[] cardColors = {"♠", "♥", "♦", "♣"};
        String[] cards = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        ArrayList<Poker> pokers = new ArrayList<>();

        for (String card : cards) {
            for (String cardColor : cardColors) {
                pokers.add(new Poker(card + cardColor, order));
                order++;
            }
        }

        pokers.add(new Poker("小王", order));
        order++;
        pokers.add(new Poker("大王", order));
        Collections.shuffle(pokers);


        ArrayList<Poker> playerOne = new ArrayList<>();
        ArrayList<Poker> playerTwo = new ArrayList<>();
        ArrayList<Poker> playerThree = new ArrayList<>();
        ArrayList<Poker> remaining = new ArrayList<>();
        for (int i = 0; i < pokers.size(); i++) {
            Poker e = pokers.get(i);
            if (i < pokers.size() - 3) {
                if (i % 3 == 0) {
                    playerOne.add(e);
                }
                if (i % 3 == 1) {
                    playerTwo.add(e);
                }
                if (i % 3 == 2) {
                    playerThree.add(e);
                }
            } else {
                remaining.add(e);
            }
        }
        Comparator<Poker> pokerComparator = Comparator.comparingInt(Poker::getOrder);
        Collections.sort(playerOne, pokerComparator);
        Collections.sort(playerTwo, pokerComparator);
        Collections.sort(playerThree, pokerComparator);
        System.out.println(playerOne);
        System.out.println(playerTwo);
        System.out.println(playerThree);
        System.out.println(remaining);

    }

}