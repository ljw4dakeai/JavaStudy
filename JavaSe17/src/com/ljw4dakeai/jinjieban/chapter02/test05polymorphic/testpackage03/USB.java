package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage03;


/**
 * @author ZJH
 * @info
 * usb 设备共性功能
 */
public interface USB {
    /**
     * 实现usb设备接入功能
     */
    public abstract void into();
    /**
     * 实现usb设备拔出功能
     */
    public abstract void out();


}
