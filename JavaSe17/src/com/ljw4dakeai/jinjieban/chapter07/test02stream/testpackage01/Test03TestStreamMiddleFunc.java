package com.ljw4dakeai.jinjieban.chapter07.test02stream.testpackage01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author ZJH
 * @info Stream 常用middle 中间 API
 */
public class Test03TestStreamMiddleFunc {
    public static void main(String[] args) {
        ArrayList<String> stringsOne = new ArrayList<>();
        ArrayList<String> stringsTwo = new ArrayList<>();
        Collections.addAll(stringsOne, "张无忌", "张三丰", "白眉鹰王", "金毛狮王", "杨过", "小龙女");
        Collections.addAll(stringsTwo, "宋江", "鲁智深", "吴用", "金毛狮王", "杨过", "小龙女", "西门庆");

        //合并Stream.concat
        System.out.println(
                Stream
                .concat(stringsOne.stream(), stringsTwo.stream())
                .toList()
        );


        //去重 distinct
        System.out.println(
                Stream
                .concat(stringsOne.stream(), stringsTwo.stream())
                .distinct()
                .toList()
        );


        //截取前面8个limit(8)
        System.out.println(
                Stream
                .concat(stringsOne.stream(), stringsTwo.stream())
                .distinct()
                .limit(8)
                .toList()
        );

        //跳过前面2个skip(2)
        System.out.println(
                Stream
                .concat(stringsOne.stream(), stringsTwo.stream())
                .distinct()
                .limit(8)
                .skip(2)
                .toList()
        );


        //过滤filter (人名长度为4的)
        System.out.println(
                Stream
                .concat(stringsOne.stream(), stringsTwo.stream())
                .distinct()
                .limit(8)
                .skip(2)
                .filter(val -> val.length() == 4)
                .toList()
        );
    }
}
