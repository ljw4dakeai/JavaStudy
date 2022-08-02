package com.ljw4dakeai.jinjieban.chapter06.HomeWorkCode;

import java.util.*;

/**
 * @author ZJH
 * @info 斗地主的实现
 */
public class WorkFour {
    public static void main(String[] args) {
        ArrayList<PokerCard> pokerCards = new ArrayList<>();
        String[] cardColors = {"♠", "♥", "♣", "♦"};
        String[] cards = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int order = 0;
        for (String card : cards) {
            for (String cardColor : cardColors) {
                pokerCards.add(new PokerCard(card + cardColor, order));
                order++;
            }
        }

        pokerCards.add(new PokerCard("小王", order));
        order++;
        pokerCards.add(new PokerCard("大王", order));

        HashMap<String, TreeSet<PokerCard>> stringTreeSetHashMap = distributeCard(getLandlord(), pokerCards);
        stringTreeSetHashMap.forEach(((player, playerPokerCars) -> System.out.println(player + " :" + playerPokerCars.stream().toList())));

    }

    public static HashMap<String, TreeSet<PokerCard>> distributeCard(HashMap<String, Integer> landlord, ArrayList<PokerCard> pokerCards) {
        List<Map.Entry<String, Integer>> entries = landlord.entrySet().stream().sorted((playerOne, playerTwo) -> playerTwo.getValue() - playerOne.getValue()).toList();
        TreeSet<PokerCard> pokerCardsOne = new TreeSet<>(Comparator.comparingInt(PokerCard::getOrder));
        TreeSet<PokerCard> pokerCardsTwo = new TreeSet<>(Comparator.comparingInt(PokerCard::getOrder));
        TreeSet<PokerCard> pokerCardsThree = new TreeSet<>(Comparator.comparingInt(PokerCard::getOrder));
        for (int i = 0; i < pokerCards.size(); i++) {
            if (i < pokerCards.size() - 3) {
                if (i % 3 == 0) {
                    pokerCardsOne.add(pokerCards.get(i));
                }
                if (i % 3 == 1) {
                    pokerCardsTwo.add(pokerCards.get(i));
                }
                if (i % 3 == 2) {
                    pokerCardsThree.add(pokerCards.get(i));
                }
            } else {
                pokerCardsOne.add(pokerCards.get(i));
            }
        }

        HashMap<String, TreeSet<PokerCard>> stringTreeSetHashMap = new HashMap<>();


        stringTreeSetHashMap.put(entries.get(0).getKey(), pokerCardsOne);
        stringTreeSetHashMap.put(entries.get(1).getKey(), pokerCardsTwo);
        stringTreeSetHashMap.put(entries.get(2).getKey(), pokerCardsThree);
        return stringTreeSetHashMap;

    }


    public static HashMap<String, Integer> getLandlord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("开始抢地主！");
        ArrayList<String> player = new ArrayList<>();
        HashMap<String, Integer> playerScore = new HashMap<>();
        playerScore.put("玩家1", 0);
        playerScore.put("玩家2", 0);
        playerScore.put("玩家3", 0);
        // 0 1 2 0 /  1  2 0 1 / 2 0 1 2
        Collections.addAll(player, "玩家1", "玩家2", "玩家3");
        int index = new Random().nextInt(3);
        for (int i = 0; i < 4; i++, index++) {
            if (index > 2) {
                index -= 3;
            }
            String somePlayer = player.get(index);
            System.out.println(somePlayer + "开始抢地主!" + "(输入抢地主,或者不抢)");
            String yesOrNo = scanner.nextLine();
            if ("抢地主".equals(yesOrNo)) {
                playerScore.replace(somePlayer, playerScore.get(somePlayer) + 1);
            } else {
                playerScore.replace(somePlayer, playerScore.get(somePlayer) - 1);
            }
        }
        return playerScore;
    }
}


class PokerCard {
    private String card;
    private int order;


    public PokerCard() {
    }

    public PokerCard(String card, int order) {
        this.card = card;
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PokerCard pokerCard)) {
            return false;
        }
        return order == pokerCard.order && Objects.equals(card, pokerCard.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card, order);
    }

    @Override
    public String toString() {
        return card;
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
}


