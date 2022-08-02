package com.ljw4dakeai.jinjieban.chapter06.test03collections.testpackage01;

import java.util.*;

/**
 * @author ZJH
 * 静态代码段实现
 */
public class Test02TestCollectionPractice {
    static ArrayList<String> playingCards = new ArrayList<>();

    //准备一副牌
    static {
        String[] cardColors = {"♣", "♠", "♥", "♦"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        Collections.addAll(playingCards, "大王", "小王");
        for (String cardColor : cardColors) {
            for (String card : cards) {
                playingCards.add(cardColor + card);
            }
        }
    }


    /**
     * 洗牌器方法
     */
    public static void shuffleCard() {
        Collections.shuffle(playingCards);
    }

    /**
     * 返回三个玩家的牌
     *
     * @return
     */
    public static HashMap<String, ArrayList<String>> separateCard() {
        HashMap<String, Integer> landlord = getLandlord();
        List<Map.Entry<String, Integer>> entries = landlord.entrySet().stream().sorted((val1, val2) -> val2.getValue() - val1.getValue()).toList();
        ArrayList<String> playerOneCard = new ArrayList<>();
        ArrayList<String> playerTwoCard = new ArrayList<>();
        ArrayList<String> playerThreeCard = new ArrayList<>();
        for (int i = 0; i <= 17; i++) {
            if (i != 17) {
                playerOneCard.add(playingCards.get(i * 3));
                playerTwoCard.add(playingCards.get(i * 3 + 1));
                playerThreeCard.add(playingCards.get(i * 3 + 2));
            } else {
                playerOneCard.add(playingCards.get(i * 3));
                playerOneCard.add(playingCards.get(i * 3 + 1));
                playerOneCard.add(playingCards.get(i * 3 + 2));
            }
        }

        HashMap<String, ArrayList<String>> stringArrayListHashMap = new HashMap<>();
        stringArrayListHashMap.put(entries.get(0).getKey(), playerOneCard);
        stringArrayListHashMap.put(entries.get(1).getKey(), playerTwoCard);
        stringArrayListHashMap.put(entries.get(2).getKey(), playerThreeCard);
        return stringArrayListHashMap;
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


    public static void main(String[] args) {
        shuffleCard();
        separateCard().entrySet().stream().toList().forEach(System.out::println);
    }
}




