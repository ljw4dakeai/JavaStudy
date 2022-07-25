package com.ljw4dakeai.jinjieban.chapter02.test04interface.testpackage01;

/**
 * @author ZJH
 */
public class Test01Interface {
    public static void main(String[] args) {
        InterImplement interImplement = new InterImplement();
        interImplement.show();

        UDisk uDisk = new UDisk();
        uDisk.check();
        uDisk.loadDriver();
        uDisk.run();

        KeyBoard keyBoard = new KeyBoard();
        keyBoard.check();
        keyBoard.loadDriver();
        keyBoard.run();
        keyBoard.click();
    }
}
