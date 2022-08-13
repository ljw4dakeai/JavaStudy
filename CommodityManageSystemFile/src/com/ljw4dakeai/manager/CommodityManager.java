package com.ljw4dakeai.manager;

import com.ljw4dakeai.domain.Commodity;
import com.ljw4dakeai.utils.FileManager;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.*;

/**
 * @author ZJH
 * @info 商品管理界面
 */
public class CommodityManager {

    /**
     * @param logger 日志对象
     * @return 一个正确的数值
     */
    public static int getChoice(Logger logger) {
        int choice;
        while (true) {
            try {
                System.out.println("请输入你的选择");
                System.out.println("-------------------------------------------");
                int realChoice = new Scanner(System.in).nextInt();
                if (realChoice > 0) {
                    choice = realChoice;
                    break;
                } else {
                    logger.error("请输入大于0的整数");
                }
            } catch (Exception e) {
                logger.error("请输入正确的整数格式");
            }
        }
        return choice;
    }

    /**
     * 初始化商品
     */
    public static void initializeStoresToFile(Logger logger, HashMap<String, ArrayList<Commodity>> stores) {
        //店铺一
        //黑马日化专营店
        ArrayList<Commodity> commoditiesOne = new ArrayList<>();
        Collections.addAll(commoditiesOne,
                new Commodity("001", "《MYSQL不删库不跑路》", 10.0, 99, "书籍", "详情介绍如何避免删库跑路", new Date()),
                new Commodity("002", "《干就对了，Java从入门到精通》", 30.0, 999, "书籍", "作者黑马程序员", new Date())
        );
        stores.put("黑马图书专营店", commoditiesOne);

        ArrayList<Commodity> commoditiesTwo = new ArrayList<>();
        Collections.addAll(commoditiesTwo,
                new Commodity("10086", "育发膏", 66.6, 10000, "日用品", "秃顶必备，头发生生不息", new Date()),
                new Commodity("10010", "防脱液", 9.9, 1000, "日用品", "诶^_^不脱发了Duang... Duang....", new Date())
        );
        stores.put("黑马生发专营店", commoditiesTwo);

        stores.keySet().forEach(storeName -> {
                    try {
                        FileManager.storeCommoditiesWriteFile(storeName, stores.get(storeName));
                        logger.info("店铺" + storeName + "写入成功!");
                    } catch (IOException e) {
                        logger.error("店铺" + storeName + "写入错误!");
                        e.printStackTrace();
                    }
                }
        );

    }

    /**
     * 文件中的对象写入到Map中
     */
    public static void initializeStoresToMemory(Logger logger, HashMap<String, ArrayList<Commodity>> stores) {
        FileManager.getStoreName().forEach(storeName -> {
                    try {
                        stores.put(storeName, FileManager.storeCommoditiesReadFile(storeName));
                        logger.info("店铺" + storeName + "数据加载成功!");
                    } catch (IOException | ClassNotFoundException e) {
                        logger.info("店铺" + storeName + "加载失败");
                        e.printStackTrace();
                    }
                }
        );
    }

    /**
     * 内存中的数据写入文件
     *
     * @param logger 日志对象
     * @param stores 各个商店商品
     */
    public static void refreshStoresToFile(Logger logger, HashMap<String, ArrayList<Commodity>> stores) {
        stores.forEach((storeName, commodities) -> {
            try {
                FileManager.storeCommoditiesWriteFile(storeName, commodities);
                logger.info("店铺" + storeName + "数据写入成功!");
            } catch (IOException e) {
                logger.error("数据保存失败!");
                e.printStackTrace();
            }
        });
    }


    /**
     * 查看所有商品
     */

    public static void listStoreAllCommodities(Logger logger, HashMap<String, ArrayList<Commodity>> stores) {
        logger.info("数据查询成功!");
        stores.forEach(
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

    private static Commodity inPutCommodities(Logger logger) {
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
                logger.error("你输入的商品价格不正确");
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
                logger.error("你输入的商品的库存数量不正确");
            }
        }
        System.out.println("请输入商品类型");
        String commodityType = scanner.nextLine();
        System.out.println("请输入商品描述");
        String commodityDesc = scanner.nextLine();
        return new Commodity("", commodityName, commodityPrice, commodityStock, commodityType, commodityDesc, new Date());
    }

    private static ArrayList<String> getStoreCommodities(HashMap<String, ArrayList<Commodity>> stores, String storeName, int number) {
        ArrayList<String> storeCommodities = new ArrayList<>();
        switch (number) {
            case 1 -> stores.get(storeName).forEach(val -> storeCommodities.add(val.getNumber()));
            case 2 -> stores.get(storeName).forEach(val -> storeCommodities.add(val.getName()));
        }
        return storeCommodities;
    }

    public static void addCommodityToStore(Logger logger, HashMap<String, ArrayList<Commodity>> stores) {
        Scanner scanner = new Scanner(System.in);
        //键盘录入店铺名称
        System.out.println("请输入店铺名称!");
        String storeName = scanner.nextLine();
        if (stores.containsKey(storeName)) {
            ArrayList<String> stringsNum = getStoreCommodities(stores, storeName, 1);
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
                        logger.error(realCommodityNumber + "商品已经存在!");
                    }
                } catch (Exception e) {
                    logger.error("请输入正确的商品编号!");
                }
            }
            Commodity commodity = inPutCommodities(logger);
            commodity.setNumber(commodityNumber);
            stores.get(storeName).add(commodity);
            logger.info(commodity.getName() + "添加成功!");
        } else {
            logger.warn(storeName + "不存在, 会自动创建!");
            ArrayList<Commodity> commodities = new ArrayList<>();
            System.out.println("请输入商品编号");
            String commodityNumber = new Scanner(System.in).nextLine();
            Commodity commodity = inPutCommodities(logger);
            commodity.setNumber(commodityNumber);
            commodities.add(commodity);
            stores.put(storeName, commodities);
            logger.info(storeName + "创建成功!");
            logger.info(commodity.getName() + "添加成功!");
        }
    }

    private static void printStoreCommodities(String storeName, HashMap<String, ArrayList<Commodity>> stores) {
        System.out.println("-------------------------------------------");
        System.out.println("店铺名称:" + storeName);
        stores.get(storeName).forEach(value -> {
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

    public static void deleteCommodityToStore(Logger logger, HashMap<String, ArrayList<Commodity>> stores) {
        System.out.println("当前店铺 : " + stores.keySet().stream().toList());
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入店铺名称!");
        String storeName = scanner.nextLine();
        if (stores.containsKey(storeName)) {
            printStoreCommodities(storeName, stores);
            System.out.println("现有商品编号:" + getStoreCommodities(stores, storeName, 1));
            System.out.println("请输入你要删除的商品编号");
            String commodityNumber = new Scanner(System.in).nextLine();
            boolean removeIf = stores.get(storeName).removeIf(val -> val.getNumber().equals(commodityNumber));
            if (removeIf) {
                logger.info(commodityNumber + "删除成功!");
            } else {
                logger.error(commodityNumber + "商品不存在!");
            }
        } else {
            logger.error(storeName + "不存在!");
        }
    }

    public static void updateCommodityToStore(Logger logger, HashMap<String, ArrayList<Commodity>> stores) {
        ArrayList<String> storeNameCommoditiesName = new ArrayList<>();
        stores.forEach((k, v) -> v.forEach(val -> storeNameCommoditiesName.add(k + " : " + val.getName())));
        System.out.println("当前店铺商品 : " + storeNameCommoditiesName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改商品店铺名称!");
        String storeName = scanner.nextLine();
        if (stores.containsKey(storeName)) {
            System.out.println("-------------------------------------------");
            ArrayList<String> storeCommoditiesNumber = getStoreCommodities(stores, storeName, 1);
            System.out.println("当前店铺的编号 : " + storeCommoditiesNumber);
            System.out.println("当前店铺的商品 : " + getStoreCommodities(stores, storeName, 2));
            System.out.println("-------------------------------------------");
            System.out.println("请输入你要修改的商品编号");
            String commodityNumber = scanner.nextLine();
            if (storeCommoditiesNumber.contains(commodityNumber)) {
                logger.info("开始修改商品" + commodityNumber);
                stores.get(storeName).removeIf(val -> val.getNumber().equals(commodityNumber));
                Commodity commodity = inPutCommodities(logger);
                commodity.setNumber(commodityNumber);
                stores.get(storeName).add(commodity);
                logger.info("商品" + commodityNumber + "修改成功!");
            } else {
                logger.error("商品" + commodityNumber + "不存在!");
            }
        } else {
            logger.error("商店" + storeName + "不存在!");
        }
    }

    public static void findCommodityFromStore(Logger logger, HashMap<String, ArrayList<Commodity>> stores) {
        ArrayList<String> storeNameCommoditiesName = new ArrayList<>();
        stores.forEach((k, v) -> v.forEach(val -> storeNameCommoditiesName.add(k + " : " + val.getName())));
        System.out.println("当前店铺商品 : " + storeNameCommoditiesName);
        System.out.println("请输入你要查询的商品");
        String commodityName = new Scanner(System.in).nextLine();
        ArrayList<Commodity> commodities = new ArrayList<>();
        stores.values().forEach(val -> val.forEach(value -> {
            if (value.getName().equals(commodityName)) {
                commodities.add(value);
            }
        }));
        if (commodities.isEmpty()) {
            logger.error("要查询的商品 : " + commodityName + "不存在!");
        } else {
            logger.info("查询成功,商品名为" + commodityName + "的信息如下!");
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
}
