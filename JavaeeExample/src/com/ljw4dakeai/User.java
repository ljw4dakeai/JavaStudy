package com.ljw4dakeai;

import java.util.Date;

/**
 * @author ZJH
 */
public class User {
    private Long id;
    //用户id
    private String username;
    //用户名
    private String gender;
    //性别
    private Date birthday;
    //生日


    public User() {
    }

    public User(Long id, String username, String gender, Date birthday) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
