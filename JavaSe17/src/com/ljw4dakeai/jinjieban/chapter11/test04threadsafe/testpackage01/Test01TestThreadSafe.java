package com.ljw4dakeai.jinjieban.chapter11.test04threadsafe.testpackage01;

/**
 * @author ZJH
 */
public class Test01TestThreadSafe {
    public static void main(String[] args) {
        Account account = new Account();

        DrawAccount drawAccountOne = new DrawAccount(account);
        drawAccountOne.setName("小明");
        DrawAccount drawAccountTwo = new DrawAccount(account);
        drawAccountTwo.setName("小红");
        DrawAccount drawAccountThree = new DrawAccount(account);
        drawAccountThree.setName("小黑");


        drawAccountOne.start();
        drawAccountTwo.start();
        drawAccountThree.start();

    }
}

class Account {
    /**
     * 封装余个对象
     */

    private int money = 100000;

    /**
     * @param money 取钱数量
     */
//    同步方法
//    public synchronized void drawMoney(int money) throws InterruptedException {
//
//        if (this.money >= money) {
//            Thread.sleep(1000);
//            this.money -= money;
//            System.out.println(Thread.currentThread().getName() + "过来取钱了, 取走了" +
//                    money + "还剩下" + this.money);
//        } else {
//            System.out.println(Thread.currentThread().getName() + "过来取钱了, 但是余额不足");
//        }
//    }
//    同步代码块
    public  void drawMoney(int money) throws InterruptedException {
        synchronized (Account.class){
            if (this.money >= money) {
                Thread.sleep(1000);
                this.money -= money;
                System.out.println(Thread.currentThread().getName() + "过来取钱了, 取走了" +
                        money + "还剩下" + this.money);
            } else {
                System.out.println(Thread.currentThread().getName() + "过来取钱了, 但是余额不足");
            }
        }
    }
}

class DrawAccount extends Thread {
    /**
     * 共享同一个账户
     */
    private Account account;

    public DrawAccount(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            account.drawMoney(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

