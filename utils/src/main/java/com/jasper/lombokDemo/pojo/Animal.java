package com.jasper.lombokDemo.pojo;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-13
 * @description
 */
@ToString(callSuper = true)
public class Animal extends BaseModel {
    private String name;
    private int age;

    public Animal(String id) {
        super(id);
    }

    public Animal(String id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }
}
