package com.ljw4dakeai.jinjieban.chapter05.test01collection.testpackage02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ZJH
 * @info 迭代器修改并发异常
 */
public class Test04TestCollectionIteratorException {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        //增加元素
        strings.add("张三丰");
        strings.add("张无忌");
        strings.add("谢逊");
        strings.add("白毛鹰王");
        strings.add("小昭");
        strings.add("俊阳公主");

        //迭代器遍历集合时是不能被修改的,,集合自己不能修改元素(不能修改集合的长度,但是可以修改值)
        // 如果发生了改变  就会触发并发修改异常
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            strings.removeIf(val -> val.equals("张无忌"));
//            System.out.println(iterator.next());
//        }

        System.out.println(strings);
        //使用迭代器自己删除的元素
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if("张无忌".equals(iterator.next())){
                iterator.remove();
            }
        }

        System.out.println(strings);
        //或者使用集合自带的removeIf方法
        strings.removeIf("张三丰"::equals);
        System.out.println(strings);

    }
}
