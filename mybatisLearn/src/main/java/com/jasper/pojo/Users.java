package com.jasper.pojo;

import lombok.Data;

@Data
public class Users {
    private Integer id;
    private String name;
    private Integer age;
    private String city;

    public Users(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
