package com.ljw4dakeai.jinjieban.chapter02.test05polymorphic.testpackage03;

/**
 * @author ZJH
 */
public class Test01TestPolymorphic {
    public static void main(String[] args) {
        Computer computer = new Computer();
        UsbKeyBoard usbKeyBoardOne = new UsbKeyBoard("usbKeyBoardOne");
        UsbKeyBoard usbKeyBoardTwo = new UsbKeyBoard("usbKeyBoardOne");
        UsbMouse usbMouse = new UsbMouse("usbMouse");
        computer.usbInto(usbKeyBoardOne);
        //true
        computer.usbInto(usbMouse);
        //true
        computer.usbInto(usbKeyBoardTwo);
        //false
        computer.usbOut(usbKeyBoardTwo);
        //false
        computer.usbOut(usbKeyBoardOne);
        //true
        computer.usbOut(usbKeyBoardOne);
        //false
        computer.usbOut(usbMouse);
        //true

    }
}
