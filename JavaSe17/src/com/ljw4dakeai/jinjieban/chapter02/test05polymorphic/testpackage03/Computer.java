package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage03;

import java.util.ArrayList;

/**
 * @author ZJH
 */
public class Computer {
    private static int connectionNum = 2;
    private static final int CONNECTION_NUM_MAX = 2;
    private static final int CONNECTION_NUM_MIN = 0;
    private static final ArrayList<USB> USB_LIST = new ArrayList<USB>();

    public void usbInto(USB usb) {
        if (connectionNum > CONNECTION_NUM_MIN && connectionNum <= CONNECTION_NUM_MAX) {
            if (usb instanceof UsbKeyBoard) {
                usb.into();
                ((UsbKeyBoard) usb).writeWord();
                connectionNum--;
                USB_LIST.add(usb);
            }
            if (usb instanceof UsbMouse) {
                usb.into();
                ((UsbMouse) usb).click();
                connectionNum--;
                USB_LIST.add(usb);
            }
        } else {
            System.out.println("没有USB设备端口可以插入啦！");
        }
    }

    public void usbOut(USB usb) {
        if (connectionNum >= CONNECTION_NUM_MIN && connectionNum  < CONNECTION_NUM_MAX) {
            if (usb instanceof UsbKeyBoard) {
                if (USB_LIST.remove(usb)) {
                    usb.out();
                    connectionNum++;
                    System.out.println("usb设备" + ((UsbKeyBoard) usb).getName() + "删除成功!");
                } else {
                    System.out.println("不存在该usb设备!");
                }
            }
            if (usb instanceof UsbMouse) {
                if (USB_LIST.remove(usb)) {
                    usb.out();
                    connectionNum++;
                    System.out.println("usb设备" + ((UsbMouse) usb).getName() + "删除成功!");
                } else {
                    System.out.println("不存在改usb设备!");
                }
            }
        } else {
            System.out.println("没有USB设备端口可以拔出啦！");
        }
    }
}
