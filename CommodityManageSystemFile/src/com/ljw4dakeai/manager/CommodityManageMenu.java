package com.ljw4dakeai.manager;

import com.ljw4dakeai.domain.Commodity;
import com.ljw4dakeai.utils.FileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ZJH
 */
public class CommodityManageMenu {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommodityManager.class);
    private final static HashMap<String, ArrayList<Commodity>> STORES = new HashMap<>();

    static {
        if (FileManager.getStoreName().isEmpty()) {
            LOGGER.info("没有任何店铺,初始化店铺!");
            CommodityManager.initializeStoresToFile(LOGGER, STORES);
        } else {
            LOGGER.info("有店铺存在,不需要初始化店铺!");
            CommodityManager.initializeStoresToMemory(LOGGER, STORES);
        }
    }

    public static void main(String[] args)  {
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("欢迎来到商品管理界面");
            System.out.println("1 : 查看所有商品");
            System.out.println("2 : 上架商品");
            System.out.println("3 : 下架商品");
            System.out.println("4 : 修改商品");
            System.out.println("5 : 查询商品");
            System.out.println("6 : 退出系统");
            switch (CommodityManager.getChoice(LOGGER)) {
                case 1 -> {
                    LOGGER.info("开始查看所有商品!");
                    CommodityManager.listStoreAllCommodities(LOGGER, STORES);
                }
                case 2 -> {
                    LOGGER.info("开始上架商品!");
                    CommodityManager.addCommodityToStore(LOGGER, STORES);
                }
                case 3 -> {
                    LOGGER.info("开始下架商品!");
                    CommodityManager.deleteCommodityToStore(LOGGER, STORES);
                }
                case 4 -> {
                    LOGGER.info("开始修改商品!");
                    CommodityManager.updateCommodityToStore(LOGGER, STORES);
                }
                case 5 -> {
                    LOGGER.info("开始查询商品!");
                    CommodityManager.findCommodityFromStore(LOGGER, STORES);
                }
                case 6 -> {
                    LOGGER.info("退出系统!");
                    CommodityManager.refreshStoresToFile(LOGGER, STORES);
                    System.exit(0);
                }
                default -> LOGGER.warn("输入错误, 请重新输入!");
            }
        }
    }
}
