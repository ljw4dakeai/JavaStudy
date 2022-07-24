package com.ljw4dakeai.jinjieban.chapter01.HomeWorkCode;

/**
 * @author ZJH
 * @info
 * - 1. 手机类Phone
 *   属性:
 *   	品牌brand,价格price
 *   行为:
 *   	打电话call,
 *   	发短信sendMessage,
 *   	玩游戏playGame
 * - 2. 测试类，创建Phone类对象,调用Phone类中的方法
 * - 3. 思考: 假设所有的手机都有屏幕的尺寸(int size)，而且假设所有手机的屏幕尺寸为6,应该如何实现?
 */
public class WorkThree {
    public static void main(String[] args) {
        Phone phone = new Phone("华为手机", 5999);
        phone.seedMessage();
        phone.playGame();
        phone.call();

        NewPhone newPhone = new NewPhone("苹果手机", 7999);
        System.out.println(newPhone);
        newPhone.call();
        newPhone.seedMessage();
        newPhone.playGame();
    }
}

class Phone {
    private String brand;
    private double price;

//    public static final  int SIZE = 6;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void call() {
        System.out.println(getBrand() + "可以打电话!");
    }


    public void seedMessage() {
        System.out.println(getBrand() + "可以发信息!");
    }

    public void playGame() {
        System.out.println(getBrand() + "可以打游戏");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


class NewPhone extends Phone {
    private final int size;

    public NewPhone(int size) {
        this.size = size;
    }

    public NewPhone(String brand, double price) {
        super(brand, price);
        this.size = 6;
    }

    @Override
    public String toString() {
        return "NewPhone{" +
                "size=" + size + '\'' +
                "brand='" + getBrand() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}