package com.rainbow.entity;

/**
 * Created by rainbow on 2016/9/14.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class User {

    private Long userId;
    private String name;
    private Integer age;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getUserId() {
        return userId;
    }


}
