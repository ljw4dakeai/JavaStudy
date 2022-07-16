package com.ljw4dakeai.Chapter09.HomeWorkCode;

/**
 * @author ZJH
 */
public class WareHouse {
    private String wareHouseNumber;
    private String wareHouseName;
    private String wareHouseLocal;
    private int wareHouseContainer;

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
