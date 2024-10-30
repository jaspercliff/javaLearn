package com.jasper.lombokDemo.annotations;

import com.jasper.lombokDemo.pojo.Animal;
import com.jasper.lombokDemo.pojo.BaseModel;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-13
 * @description
 */
public class ToStringDemo {
    public static void main(String[] args) {
        BaseModel baseModel = new BaseModel("1");
        System.out.println("baseModel = " + baseModel);
        Animal asd = new Animal("2", "asd", 2);
        System.out.println("asd = " + asd);
    }
}
