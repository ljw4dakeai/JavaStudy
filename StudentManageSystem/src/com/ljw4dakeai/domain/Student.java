package com.ljw4dakeai.domain;

/**
 * @author ZJH
 */
public class Student {
    private int number;
    private String name;
    private String gander;
    private String birthday;

    public Student() {
    }

    public Student(int number, String name, String gander, String birthday) {
        this.number = number;
        this.name = name;
        this.gander = gander;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", gander='" + gander + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


}
