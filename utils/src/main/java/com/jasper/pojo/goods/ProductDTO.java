package com.jasper.pojo.goods;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
    private long id;
    private String name;
    private String des;
}
