package com.ljw4dakeai.JiChuBan.Chapter09;

/**
 * @author ZJH
 * @info
 */
class Singer {
    private String name;
    private int age;
    private String gender;

    public Singer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Singer[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ']';
    }

    public void sing() {
        System.out.println("只因你太美!");
    }

    public void dance() {
        System.out.println("新宝岛!");
    }

    public void rape() {
        System.out.println("大碗牢饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


public  class Test02SingerTest {
    public static void main(String[] args) {
        //船舰类的对象
        Singer singer = new Singer("菜虚鲲", 24, " 男");

        //对象干活！
        singer.dance();
        singer.sing();
        singer.rape();
    }
}