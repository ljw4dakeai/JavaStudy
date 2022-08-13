package com.ljw4dakeai.jinjieban.chapter14.test01xmlexplane.testpackage01;

/**
 * @author ZJH
 */
public class Contacts {
    private String id;
    private boolean vip;
    private String name;
    private String gender;
    private String email;

    public Contacts() {
    }

    public Contacts(String id, boolean vip, String name, String gender, String email) {
        this.id = id;
        this.vip = vip;
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id='" + id + '\'' +
                ", vip=" + vip +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
