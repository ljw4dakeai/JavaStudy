package com.ljw4dakeai.jinjieban.chapter13.test08annotation.testpackage02;

/**
 * @author ZJH
 */
@Book(value = "《Java基础》", authors = {"大王", "小李"})
public class BookStore {

    @Book(value = "《Java web》", authors = {"老蔡", "小黑"})
    public void buyBook(){
    }
}
