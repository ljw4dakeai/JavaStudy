package com.ljw4dakeai.jinjieban.chapter03.test03api.testpackage02;

/**
 * @author ZJH
 */
public class Test01ObjectEquals {
    public static void main(String[] args) {
        Student zoujiahaoOne = new Student("zoujiahao", 21);
        Student zoujiahaoTwo = new Student("zoujiahao", 21);

//        没有复写都是false,和==一样  是比较地址值
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }
//        如果被复写了  就是按照复写的方法进行比较的
        System.out.println(zoujiahaoOne == zoujiahaoTwo);
        System.out.println(zoujiahaoOne.equals(zoujiahaoTwo));

    }
}
