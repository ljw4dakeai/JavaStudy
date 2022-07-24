package com.ljw4dakeai.jichuban.Chapter09;

/**
 * @author ZJH
 * @info
 *
 * 方法中是局部变量, 方法外 类中 是成员变量
 */
public class Test03PhoneTest {
    public static void main(String[] args) {
        Phone rongYao20 = new Phone("荣耀20", 5999.0, "华为", "中华有为");
        rongYao20.playGame();
        rongYao20.scanDouYin();
        System.out.println(rongYao20.getName());
        System.out.println(rongYao20.getPrice());
    }
}

class Phone {


    private String name;
    private double price;
    private String brand;
    private String info;

    public Phone(String name, double price, String brand, String info) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public void scanDouYin() {
        System.out.println("刷抖音，刷到头晕!");
    }

    public void playGame() {
        System.out.println("打游戏，打到想吐！");
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
