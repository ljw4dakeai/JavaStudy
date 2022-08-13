package com.ljw4dakeai.manager;

import com.ljw4dakeai.domain.Commodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author ZJH
 * @info 商品管理界面
 */
public class CommodityManager {
    public static final Logger LOGGER = LoggerFactory.getLogger(CommodityManager.class);
    /**
     * 店铺数组
     */
    private final static HashMap<String, ArrayList<Commodity>> STORES = new HashMap<>();

    //初始化商品
    static {
        //店铺一
        //黑马日化专营店
        ArrayList<Commodity> commoditiesOne = new ArrayList<>();
        Collections.addAll(commoditiesOne,
                new Commodity("001", "《MYSQL不删库不跑路》", 10.0, 99, "书籍", "详情介绍如何避免删库跑路", new Date()),
                new Commodity("002", "《干就对了，Java从入门到精通》", 30.0, 999, "书籍", "作者黑马程序员", new Date())
        );
        STORES.put("黑马图书专营店", commoditiesOne);

        ArrayList<Commodity> commoditiesTwo = new ArrayList<>();
        Collections.addAll(commoditiesTwo,
                new Commodity("10086", "育发膏", 66.6, 10000, "日用品", "秃顶必备，头发生生不息", new Date()),
                new Commodity("10010", "防脱液", 9.9, 1000, "日用品", "诶^_^不脱发了Duang... Duang....", new Date())
        );
        STORES.put("黑马生发专营店", commoditiesTwo);


        //店铺入店铺数组


    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("欢迎来到商品管理界面");
            System.out.println("1 : 查看所有商品");
            System.out.println("2 : 上架商品");
            System.out.println("3 : 下架商品");
            System.out.println("4 : 修改商品");
            System.out.println("5 : 查询商品");
            System.out.println("6 : 退出系统");
            int choice;
            while (true) {
                try {
                    System.out.println("请输入你的选择");
                    System.out.println("-------------------------------------------");
                    int realChoice = new Scanner(System.in).nextInt();
                    if (realChoice > 0) {
                        choice = realChoice;
                        break;
                    }
                } catch (Exception e) {
                    LOGGER.error("请书如正确的整数格式");
                }
            }

            switch (choice) {
                case 1 -> {
                    LOGGER.info("开始查看所有商品!");
                    findStoreAllCommodities();
                }
                case 2 -> {
                    LOGGER.info("开始上架商品!");
                    addStoreCommodities();
                }
                case 3 -> {
                    LOGGER.info("开始下架商品!");
                    deleteStoreCommodity();
                }
                case 4 -> {
                    LOGGER.info("开始修改商品!");
                    updateStoreCommodity();
                }
                case 5 -> {
                    LOGGER.info("开始查询商品!");
                    findCommoditiesFromStore();
                }
                case 6 -> {
                    LOGGER.info("退出系统!");
                    System.exit(0);
                }
                default -> LOGGER.warn("输入错误, 请重新输入!");
            }
        }
    }

    private static void findCommoditiesFromStore() {
        ArrayList<String> storeNameCommoditiesName = new ArrayList<>();
        STORES.forEach((k, v) -> v.forEach(val -> storeNameCommoditiesName.add(k + " : " + val.getName())));
        System.out.println("当前店铺商品 : " + storeNameCommoditiesName);
        System.out.println("请输入你要查询的商品");
        String commodityName = new Scanner(System.in).nextLine();
        ArrayList<Commodity> commodities = new ArrayList<>();
        STORES.values().forEach(val -> val.forEach(value -> {
            if (value.getName().equals(commodityName)) {
                commodities.add(value);
            }
        }));
        if (commodities.isEmpty()) {
            LOGGER.error("要查询的商品 : " + commodityName + "不存在!");
        } else {
            LOGGER.info("查询成功,商品名为" + commodityName + "的信息如下!");
            commodities.forEach(value -> {
                System.out.println("\t\t-------------------------------------");
                System.out.println("\t\t商品编号 : " + value.getNumber());
                System.out.println("\t\t商品名称 : " + value.getName());
                System.out.println("\t\t商品价格 : " + value.getPrice());
                System.out.println("\t\t商品库存 : " + value.getStock());
                System.out.println("\t\t商品类型 : " + value.getType());
                System.out.println("\t\t商品描述 : " + value.getDesc());
                System.out.println("\t\t商品上架时间 : " + value.getCreateTime());
                System.out.println("\t\t-------------------------------------");
            });
        }

    }

    private static void updateStoreCommodity() {
        ArrayList<String> storeNameCommoditiesName = new ArrayList<>();
        STORES.forEach((k, v) -> v.forEach(val -> storeNameCommoditiesName.add(k + " : " + val.getName())));
        System.out.println("当前店铺商品 : " + storeNameCommoditiesName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改商品店铺名称!");
        String storeName = scanner.nextLine();
        if (STORES.containsKey(storeName)) {
            System.out.println("-------------------------------------------");
            ArrayList<String> storeCommoditiesNumber = getStoreCommodities(storeName, 1);
            System.out.println("当前店铺的编号 : " + storeCommoditiesNumber);
            System.out.println("当前店铺的商品 : " + getStoreCommodities(storeName, 2));
            System.out.println("-------------------------------------------");
            System.out.println("请输入你要修改的商品编号");
            String commodityNumber = scanner.nextLine();
            if (storeCommoditiesNumber.contains(commodityNumber)) {
                LOGGER.info("开始修改商品" + commodityNumber);
                STORES.get(storeName).removeIf(val -> val.getNumber().equals(commodityNumber));
                Commodity commodity = inPutCommodities();
                commodity.setNumber(commodityNumber);
                STORES.get(storeName).add(commodity);
                LOGGER.info("商品" + commodityNumber + "修改成功!");
            } else {
                LOGGER.error("商品" + commodityNumber + "不存在!");
            }
        } else {
            LOGGER.error("商店" + storeName + "不存在!");
        }
    }


    private static void deleteStoreCommodity() {
        System.out.println("当前店铺 : " + STORES.keySet().stream().toList());
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入店铺名称!");
        String storeName = scanner.nextLine();
        if (STORES.containsKey(storeName)) {
            printStoreCommodities(storeName);
            System.out.println("现有商品编号:" + getStoreCommodities(storeName, 1));
            System.out.println("请输入你要删除的商品编号");
            String commodityNumber = new Scanner(System.in).nextLine();
            boolean removeIf = STORES.get(storeName).removeIf(val -> val.getNumber().equals(commodityNumber));
            if (removeIf) {
                LOGGER.info(commodityNumber + "删除成功!");
            } else {
                LOGGER.error(commodityNumber + "商品不存在!");
            }
        } else {
            LOGGER.error(storeName + "不存在!");
        }
    }

    private static void printStoreCommodities(String storeName) {
        System.out.println("-------------------------------------------");
        System.out.println("店铺名称:" + storeName);
        STORES.get(storeName).forEach(value -> {
            System.out.println("\t\t商品编号 : " + value.getNumber());
            System.out.println("\t\t商品名称 : " + value.getName());
            System.out.println("\t\t商品价格 : " + value.getPrice());
            System.out.println("\t\t商品库存 : " + value.getStock());
            System.out.println("\t\t商品类型 : " + value.getType());
            System.out.println("\t\t商品描述 : " + value.getDesc());
            System.out.println("\t\t商品上架时间 : " + value.getCreateTime());
            System.out.println("\t\t-------------------------------------");
        });
    }


    /**
     * 上架商品的方法
     */
    private static void addStoreCommodities() {
        Scanner scanner = new Scanner(System.in);
        //键盘录入店铺名称
        System.out.println("请输入店铺名称!");
        String storeName = scanner.nextLine();
        if (STORES.containsKey(storeName)) {
            ArrayList<String> stringsNum = getStoreCommodities(storeName, 1);
            System.out.println("现在商店里的商品编号为 : " + stringsNum);
            String commodityNumber;
            while (true) {
                try {
                    System.out.println("请输入商品编号!");
                    String realCommodityNumber = new Scanner(System.in).nextLine();
                    if (!stringsNum.contains(realCommodityNumber)) {
                        commodityNumber = realCommodityNumber;
                        break;
                    } else {
                        LOGGER.error(realCommodityNumber + "商品已经存在!");
                    }
                } catch (Exception e) {
                    LOGGER.error("请输入正确的商品编号!");
                }
            }
            Commodity commodity = inPutCommodities();
            commodity.setNumber(commodityNumber);
            STORES.get(storeName).add(commodity);
            LOGGER.info(commodity.getName() + "添加成功!");
        } else {
            LOGGER.warn(storeName + "不存在, 会自动创建!");
            ArrayList<Commodity> commodities = new ArrayList<>();
            Commodity commodity = inPutCommodities();
            System.out.println("请输入商品编号");
            commodity.setNumber(new Scanner(System.in).nextLine());
            commodities.add(commodity);
            STORES.put(storeName, commodities);
            LOGGER.info(storeName + "创建成功!");
            LOGGER.info(commodity.getName() + "添加成功!");
        }
    }

    private static ArrayList<String> getStoreCommodities(String storeName, int number) {
        ArrayList<String> storeCommodities = new ArrayList<>();
        switch (number) {
            case 1 -> STORES.get(storeName).forEach(val -> storeCommodities.add(val.getNumber()));
            case 2 -> STORES.get(storeName).forEach(val -> storeCommodities.add(val.getName()));
        }
        return storeCommodities;
    }

    /**
     * 商品的输入
     */
    private static Commodity inPutCommodities() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称");
        String commodityName = scanner.nextLine();
        double commodityPrice;
        while (true) {
            try {
                System.out.println("请输入商品价格");
                double realCommodityPrice = new Scanner(System.in).nextDouble();
                if (realCommodityPrice >= 0) {
                    commodityPrice = realCommodityPrice;
                    break;
                }
            } catch (Exception e) {
                LOGGER.error("你输入的商品价格不正确");
            }
        }
        int commodityStock;
        while (true) {
            try {
                System.out.println("请输入商品库存");
                int realCommodityStock = new Scanner(System.in).nextInt();
                if (realCommodityStock >= 0) {
                    commodityStock = realCommodityStock;
                    break;
                }
            } catch (Exception e) {
                LOGGER.error("你输入的商品的库存数量不正确");
            }
        }
        System.out.println("请输入商品类型");
        String commodityType = scanner.nextLine();
        System.out.println("请输入商品描述");
        String commodityDesc = scanner.nextLine();
        return new Commodity("", commodityName, commodityPrice, commodityStock, commodityType, commodityDesc, new Date());
    }

    /**
     * 所有商品的查看
     */
    private static void findStoreAllCommodities() {
        STORES.forEach(
                (k, v) -> {
                    System.out.println("-------------------------------------------");
                    System.out.println("店铺名称:" + k);
                    v.forEach(value -> {
                                System.out.println("\t\t商品编号 : " + value.getNumber());
                                System.out.println("\t\t商品名称 : " + value.getName());
                                System.out.println("\t\t商品价格 : " + value.getPrice());
                                System.out.println("\t\t商品库存 : " + value.getStock());
                                System.out.println("\t\t商品类型 : " + value.getType());
                                System.out.println("\t\t商品描述 : " + value.getDesc());
                                System.out.println("\t\t商品上架时间 : " + value.getCreateTime());
                                System.out.println("\t\t-------------------------------------");
                            }
                    );

                }
        );
    }
}
