package com.ljw4dakeai.jichuban.Chapter09.HomeWorkCode;

import java.util.Scanner;

/**
 * @author ZJH
 * @info - 自己xx管理系统中  xxx实体类的编写
 * <p>
 * - 例如 学生管理系统中的 学生
 * <p>
 * 英雄管理系统中的英雄
 * <p>
 * 女朋友管理系统中的女朋友
 * <p>
 * - 要求 至少编写四个属性
 * <p>
 * - 构造方法 getter setter  toString
 * <p>
 * - 第四题的基础上完成
 * <p>
 * - 键盘录入xxx的相关数据
 * <p>
 * - 并将数据存储到学生对象中 (使用set方法赋值)
 * <p>
 * - 打印xxx对象
 * <p>
 * - 第四题的基础上完成
 * <p>
 * - 键盘录入xxx的相关数据
 * <p>
 * - 并将数据存储到学生对象中 (使用全参方法赋值)
 * <p>
 * - 打印xxx对象
 */
public class WareHouseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入仓库编号!");
        String wareHouseNumber = scanner.next();
        System.out.println("请输入仓库名字!");
        String wareHouseName = scanner.next();
        System.out.println("请输入仓库地址!");
        String wareHouseLocal = scanner.next();
        System.out.println("请输入仓库容量");
        int wareHouseContainer = scanner.nextInt();

        WareHouse wareHouse = new WareHouse();
        wareHouse.setWareHouseNumber(wareHouseNumber);
        wareHouse.setWareHouseName(wareHouseName);
        wareHouse.setWareHouseLocal(wareHouseLocal);
        wareHouse.setWareHouseContainer(wareHouseContainer);

        System.out.println(wareHouse);


        WareHouse wareHouseOne = input();
        System.out.println(wareHouseOne);

    }

    public static WareHouse input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入仓库编号!");
        String wareHouseNumber = scanner.next();
        System.out.println("请输入仓库名字!");
        String wareHouseName = scanner.next();
        System.out.println("请输入仓库地址!");
        String wareHouseLocal = scanner.next();
        System.out.println("请输入仓库容量");
        int wareHouseContainer = scanner.nextInt();

        return new WareHouse(wareHouseNumber, wareHouseName, wareHouseLocal, wareHouseContainer);
    }
}

class WareHouse {
    private String wareHouseNumber;
    private String wareHouseName;
    private String wareHouseLocal;
    private int wareHouseContainer;

    public WareHouse() {
    }

    public WareHouse(String wareHouseNumber, String wareHouseName, String wareHouseLocal, int wareHouseContainer) {
        this.wareHouseNumber = wareHouseNumber;
        this.wareHouseName = wareHouseName;
        this.wareHouseLocal = wareHouseLocal;
        this.wareHouseContainer = wareHouseContainer;
    }

    @Override
    public String toString() {
        return "WareHouse[" +
                "wareHouseNumber='" + wareHouseNumber + '\'' +
                ", wareHouseName='" + wareHouseName + '\'' +
                ", wareHouseLocal='" + wareHouseLocal + '\'' +
                ", wareHouseContainer=" + wareHouseContainer +
                ']';
    }

    public String getWareHouseNumber() {
        return wareHouseNumber;
    }

    public void setWareHouseNumber(String wareHouseNumber) {
        this.wareHouseNumber = wareHouseNumber;
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }

    public String getWareHouseLocal() {
        return wareHouseLocal;
    }

    public void setWareHouseLocal(String wareHouseLocal) {
        this.wareHouseLocal = wareHouseLocal;
    }

    public int getWareHouseContainer() {
        return wareHouseContainer;
    }

    public void setWareHouseContainer(int wareHouseContainer) {
        this.wareHouseContainer = wareHouseContainer;
    }
}
