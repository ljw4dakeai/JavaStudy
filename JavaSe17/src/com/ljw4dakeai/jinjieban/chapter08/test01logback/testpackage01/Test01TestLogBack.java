package com.ljw4dakeai.jinjieban.chapter08.test01logback.testpackage01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author ZJH
 */
public class Test01TestLogBack {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Test01TestLogBack.class);

        for (int i = 0; i < 10; i++) {
            logger.debug("这是第一条调试信息!" + (4 * i));
            logger.info("这是第一条记录信息!" +(4 * i + 1 ));
            logger.error("这是一条错误信息" +(4 * i + 2));
            logger.warn("这是一条警告信息" + (4 * i + 3 ));
        }
    }

}
