package com.ljw4dakeai.jinjieban.chapter06.test04map.testpackage01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

/**
 * @author ZJH
 */
public class Test05TestOrderListNesting {
    public static void main(String[] args) {
        //订单1
        ArrayList<Commodity> commoditiesOne = new ArrayList<>();
        commoditiesOne.add(new Commodity("iPhone12Pro", 9999.9, 1));
        commoditiesOne.add(new Commodity("MacBook Pro", 19999.9, 1));
        commoditiesOne.add(new Commodity("ipad Pro 2022", 8999.9, 1));
        commoditiesOne.add(new Commodity("AirPods", 999, 1));
        //订单2
        ArrayList<Commodity> commoditiesTwo = new ArrayList<>();
        commoditiesTwo.add(new Commodity("拖鞋", 19.9, 4));
        commoditiesTwo.add(new Commodity("衣架", 9.9, 10));
        commoditiesTwo.add(new Commodity("内裤", 8999.9, 2));
        commoditiesTwo.add(new Commodity("运动鞋", 999, 2));


        HashMap<UUID, ArrayList<Commodity>> integerArrayListHashMap = new HashMap<>();
        integerArrayListHashMap.put(UUID.randomUUID(), commoditiesOne);
        integerArrayListHashMap.put(UUID.randomUUID(), commoditiesTwo);

        integerArrayListHashMap.forEach((k,v) -> {
            System.out.println(k);
            v.forEach(System.out :: println);
            System.out.println("-----------------------------------");
        });

    }
}
class Commodity {
    private String name;
    private double price;
    private int number;


    public Commodity() {
    }

    public Commodity(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }


    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Commodity commodity)) {
            return false;
        }
        return Double.compare(commodity.getPrice(), getPrice()) == 0 && getNumber() == commodity.getNumber() && Objects.equals(getName(), commodity.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getNumber());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}