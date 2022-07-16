package com.ljw4dakeai.WarehouseManageSystem;


import java.util.Scanner;

/**
 * @author ZJH
 */
public class Main {
    public static void main(String[] args) {


        while (true) {
            System.out.println("欢迎来到仓库管理系统！");
            System.out.println("输入1 新增仓库！");
            System.out.println("输入2 删除仓库！");
            System.out.println("输入3 修改仓库！");
            System.out.println("输入4 查看仓库！");
            System.out.println("输入5 退出再见！");
            System.out.println("请输入一个数：");
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1 -> add();
                case 2 -> del();
                case 3 -> update();
                case 4 -> find();
                case 5 -> {
                    System.out.println("再见!");
                    System.exit(1);
                }
                default -> System.out.println("输入错误, 请重新输入!");
            }
        }
    }

    public static WareHouse input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入仓库名：");
        String wareHouseName = scanner.nextLine();
        System.out.println("请输入仓库地址：");
        String wareHouseLocal = scanner.nextLine();
        System.out.println("请输入仓库最大容量：");
        int wareHouseMax = scanner.nextInt();
        return new WareHouse(wareHouseName, wareHouseLocal, wareHouseMax);
    }


    public static void add() {
        WareHouseManage wareHouseManage = new WareHouseManage();
        wareHouseManage.warehouseAdd(input());
    }

    public static void del() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入仓库名：");
        String wareHouseName = scanner.nextLine();
        WareHouseManage wareHouseManage = new WareHouseManage();
        wareHouseManage.warehouseDel(wareHouseName);
    }


    public static void update() {
        WareHouseManage wareHouseManage = new WareHouseManage();
        wareHouseManage.warehouseUpdate(input());
    }

    public static void find() {
        WareHouseManage wareHouseManage = new WareHouseManage();
        wareHouseManage.warehouseFind();
    }

}
