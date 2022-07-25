package com.ljw4dakeai.jinjieban.chapter02.HomeWorkCode.workpackage02;

/**
 * @author ZJH
 */
public class TestPhone {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
         newPhone.call();
         newPhone.seedMessage();
         newPhone.playGame();

        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.seedMessage();
    }

}
