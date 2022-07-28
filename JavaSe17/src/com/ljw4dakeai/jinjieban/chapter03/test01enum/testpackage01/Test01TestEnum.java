package com.ljw4dakeai.jinjieban.chapter03.test01enum.testpackage01;

/**
 * @author ZJH
 */
public class Test01TestEnum {
    public static void main(String[] args) {
        move(Direction.UP);

        Direction right = Direction.RIGHT;
        move(right);

        move(Direction.valueOf("DOWN"));
        //不可忽视大小写
    }


    public static void move(Direction direction) {
        switch (direction) {
            case UP -> System.out.println("向上");
            case DOWN -> System.out.println("向下");
            case LEFT -> System.out.println("向左");
            case RIGHT -> System.out.println("向右");
        }
    }
}
