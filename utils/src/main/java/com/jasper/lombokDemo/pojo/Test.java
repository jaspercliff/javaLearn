package com.jasper.lombokDemo.pojo;

import lombok.Builder;
import lombok.ToString;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-02
 * @description
 */
@Builder(toBuilder = true)
@ToString
public class Test {
    String firstName;
    String lastName;
    int age;
    String email;
    String phone;
}
