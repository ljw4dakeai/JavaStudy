package com.ljw4dakeai.jinjieban.chapter06.test01generic.testpackage01;

import java.util.Arrays;

/**
 * @author ZJH
 * @info 自定义类型泛型创建
 * 自定义一个ArrayList集合, 和ArrayList一样, 也使用数组存储
 */
public class Test02TestGenericClassCreate {
    public static void main(String[] args) {
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>();
        integerMyArrayList.add(10);
        integerMyArrayList.add(20);
        integerMyArrayList.add(30);
        integerMyArrayList.add(40);
        integerMyArrayList.add(40);
        integerMyArrayList.add(40);
        integerMyArrayList.add(40);
        integerMyArrayList.add(40);
        integerMyArrayList.add(40);
        integerMyArrayList.add(40);


        System.out.println(integerMyArrayList);


        System.out.println(integerMyArrayList.get(0));
        System.out.println(integerMyArrayList.get(3));
        System.out.println(integerMyArrayList.get(6));


        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        stringMyArrayList.add("zoujiahao");
        stringMyArrayList.add("lijingwen");
        stringMyArrayList.add("dakeai");
        stringMyArrayList.add("xiaoshuaige");

        System.out.println(stringMyArrayList);

        System.out.println(stringMyArrayList.get(0));
        System.out.println(stringMyArrayList.get(6));
        System.out.println(stringMyArrayList.get(2));

        for (int i = 0; i < stringMyArrayList.size() -1; i++) {
            System.out.println(stringMyArrayList.get(i));
        }



    }

}

class MyArrayList<E>{
    private Object[] objects = new Object[10];
    private int index = 0;

    /**
     * 添加一个元素到数组中
     * @param e 添加的元素
     */
    public void add(E e) {
        if (index < objects.length) {
            objects[index] = e;
            index++;
        } else {
            System.out.println("list中的数据已经满了");
        }
    }

    /**
     * 获取对应索引位置的元素
     * @param index 索引
     * @return 返回元素
     */
    public E get(int index) {
        if (index <= this.index) {
            return (E) objects[index];
        }else {
            return null;
        }
    }

    /**
     *
     * @return 范湖数组的长度
     */
    public int size(){
        return  index + 1;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[ ");
        for (int i = 0; i < index; i++) {
            if (i!=index -1){
                stringBuilder.append(objects[i]).append(" , ");
            }else {
                stringBuilder.append(objects[i]);
            }
        }
        return  stringBuilder.append(" ]").toString();
    }
}
