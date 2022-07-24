package com.ljw4dakeai.jichuban.Chapter05;

/**
 * @author ZJH
 * @info for 循环的使用
 */
public class Test03For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Word!");
        }


        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        for (int l = 5; l >= 1; l--) {
            System.out.println(l);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        //一到一百的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);


        //一到一百的偶数和
        int sum_ = 0;
        for (int i = 1; i <= 100; i++) {
            sum_ += (i % 2 == 0 ? i : 0);
        }
        System.out.println(sum_);


        //另一种写法
        int sum__ = 0;
        for (int i = 0; i <= 100; i = i + 2) {
            sum__ += i;
        }
        System.out.println(sum__);


        //while 实现
        int sum___ = 0;
        int i = 0;
        while (i <= 100) {
            sum___ += i;
            i += 2;
        }
        System.out.println(sum___);

//        for (int j = 0; j < 100; j++) {
//            if (j % 2 == 0) {
//                System.out.println(j);
//            } else {
//                System.out.print(j);
//            }
//        }

    }
}

class ForDieLoop {
    public static void main(String[] args) {
        int i = 0;
        for (; ; ) {
            System.out.println("Hello Word");
            i++;
            if (i == 100) {
                System.exit(1);
            }
        }
    }
}
