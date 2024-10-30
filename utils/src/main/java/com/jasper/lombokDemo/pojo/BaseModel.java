package com.jasper.lombokDemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-13
 * @description
 */
@Data
@ToString
@AllArgsConstructor
public class BaseModel {
    private String id;
}
