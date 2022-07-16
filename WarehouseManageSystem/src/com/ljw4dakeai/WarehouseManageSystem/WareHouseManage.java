package com.ljw4dakeai.WarehouseManageSystem;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ZJH
 */
public class WareHouseManage {

    static List<WareHouse> wareHouseList = new ArrayList<>();

    public void warehouseAdd(WareHouse wareHouse) {
        if (wareHouseList.isEmpty()) {
            wareHouseList.add(wareHouse);
            System.out.println("仓库" + wareHouse.getWareHouseName() + "添加成功!");
        } else {
            boolean flag = false;
            for (WareHouse wareHouseOne : wareHouseList) {
                if (wareHouseOne.getWareHouseName().equals(wareHouse.getWareHouseName())) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                wareHouseList.add(wareHouse);
                System.out.println("仓库" + wareHouse.getWareHouseName() + "添加成功!");
            } else {
                System.out.println("该仓库已经存在，无法添加仓库！");
            }
        }
        System.out.println("==========================================================");
    }

    public void warehouseUpdate(WareHouse wareHouse) {
        if (wareHouseList.isEmpty()) {
            System.out.println("没有任何仓库，无法修改仓库！");
            System.out.println("==========================================================");
        } else {
            for (WareHouse wareHouseOne : wareHouseList) {
                if (wareHouseOne.getWareHouseName().equals(wareHouse.getWareHouseName())) {
                    wareHouseOne.setWareHouseLocal(wareHouse.getWareHouseLocal());
                    wareHouseOne.setWareHouseMax(wareHouse.getWareHouseMax());
                    System.out.println("仓库" + wareHouse.getWareHouseName() + "修改成功!");
                    System.out.println("==========================================================");
                    break;
                } else {
                    System.out.println("请输入正确的仓库名");
                    System.out.println("==========================================================");
                }
            }
        }
    }

    public void warehouseDel(String wareHouseName) {
        boolean removeIf = wareHouseList.removeIf(wareHouseOne -> wareHouseOne.getWareHouseName().equals(wareHouseName));
        if (removeIf) {
            System.out.println("仓库" + wareHouseName + "删除成功!");
        } else {
            System.out.println("不存在该仓库，无法删除仓库！");
        }
        System.out.println("==========================================================");

    }

    public void warehouseFind() {
        if (wareHouseList.isEmpty()) {
            System.out.println("该系统中没有任何仓库！");
        } else {
            wareHouseList.forEach(wareHouseOne -> System.out.println(wareHouseOne.toString()));
        }
        System.out.println("==========================================================");

    }

}

class WareHouse {
    private String wareHouseName;
    private String wareHouseLocal;
    private int wareHouseMax;

    public WareHouse(String wareHouseName, String wareHouseLocal, int wareHouseMax) {
        this.wareHouseName = wareHouseName;
        this.wareHouseLocal = wareHouseLocal;
        this.wareHouseMax = wareHouseMax;
    }


    @Override
    public String toString() {
        return "WareHouse[" +
                "仓库名='" + wareHouseName + '\'' +
                ", 仓库地址='" + wareHouseLocal + '\'' +
                ", 仓库容量=" + wareHouseMax +
                ']';
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

    public int getWareHouseMax() {
        return wareHouseMax;
    }

    public void setWareHouseMax(int wareHouseMax) {
        this.wareHouseMax = wareHouseMax;
    }
}
