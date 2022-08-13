package com.ljw4dakeai.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @author ZJH
 * @info
 * 商品类
 */
public class Commodity implements Serializable {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    private String number;
    private String name;
    private double price;
    private int stock;
    private String type;
    private String desc;
    private Date createTime;


    public Commodity() {
    }

    public Commodity(String number, String name, double price, int stock, String type, String desc, Date createTime) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.type = type;
        this.desc = desc;
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Commodity commodity)) {
            return false;
        }
        return Double.compare(commodity.price, price) == 0 && stock == commodity.stock && Objects.equals(number, commodity.number) && Objects.equals(name, commodity.name) && Objects.equals(type, commodity.type) && Objects.equals(desc, commodity.desc) && Objects.equals(createTime, commodity.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, price, stock, type, desc, createTime);
    }


    @Override
    public String toString() {
        return "Commodity{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", createTime=" + SIMPLE_DATE_FORMAT.format(createTime) +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreateTime() {
        return SIMPLE_DATE_FORMAT.format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
