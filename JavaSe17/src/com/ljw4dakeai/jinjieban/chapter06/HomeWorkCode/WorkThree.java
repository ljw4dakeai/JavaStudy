package com.ljw4dakeai.jinjieban.chapter06.HomeWorkCode;

import java.util.*;

/**
 * @author ZJH
 * @info
 * - 定义一个Phone类，有品牌brand，价格price两个属性
 * - 选择合适的集合，往该集合一中添加3个Phone对象，要求元素不能重复，并且保证存取顺序
 */
public class WorkThree {
    public static void main(String[] args) {
        LinkedHashSet<Phone> phones = new LinkedHashSet<>();
        phones.add(new Phone("nove9pro", "华为", 2999.9));
        phones.add(new Phone("GTpro", "realme", 1999.9));
        phones.add(new Phone("k30pro", "小米", 2299.9));

        phones.forEach(System.out::println);
    }
}

class Phone{
    private String name;
    private String brand;
    private double price;

    public Phone() {
    }

    public Phone(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Phone phone)) {
            return false;
        }
        return Double.compare(phone.getPrice(), getPrice()) == 0 && Objects.equals(getName(), phone.getName()) && Objects.equals(getBrand(), phone.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBrand(), getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
