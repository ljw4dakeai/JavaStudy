package com.ljw4dakeai.utils;

import com.ljw4dakeai.domain.Commodity;

import java.io.*;
import java.util.ArrayList;

/**
 * @author ZJH
 * @info 对商店商品文件的写入和读取
 */
public class FileManager {
    public static void storeCommoditiesWriteFile(String storeName, ArrayList<Commodity> commodities) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("CommodityManageSystemFile\\src\\com\\ljw4dakeai\\data\\" + storeName + ".txt"));
        objectOutputStream.writeObject(commodities);
        objectOutputStream.close();
    }


    public static ArrayList<Commodity> storeCommoditiesReadFile(String storeName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("CommodityManageSystemFile\\src\\com\\ljw4dakeai\\data\\" + storeName + ".txt"));
        @SuppressWarnings("unchecked")
        ArrayList<Commodity> commoditiesReader = (ArrayList<Commodity>) objectInputStream.readObject();
        objectInputStream.close();
        return commoditiesReader;
    }

    public static ArrayList<String> getStoreName() {
        File file = new File("CommodityManageSystemFile\\src\\com\\ljw4dakeai\\data");
        ArrayList<String> stores = new ArrayList<>();
        File[] files = file.listFiles();
        assert files != null;
        for (File f : files) {
            if (!f.isDirectory()) {
                stores.add(f.getName().split("\\.")[0]);
            }
        }
        return stores;
    }

}
