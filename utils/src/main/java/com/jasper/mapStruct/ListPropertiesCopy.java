package com.jasper.mapStruct;

import com.jasper.mapStruct.convert.OrderConvert;
import com.jasper.pojo.goods.*;

import java.util.Arrays;
import java.util.List;

public class ListPropertiesCopy {
    public static void main(String[] args) {
        final Customer customer = new Customer(1, "jasper");
        final ProductDTO product = new ProductDTO(1, "coat", "coat");
        final ProductDTO product1 = new ProductDTO(2, "shirt", "shirt");
        final List<ProductDTO> list = Arrays.asList(product, product1);
        final OrderDTO orderDTO = new OrderDTO(1,customer, list);
        final Order order = OrderConvert.INSTANCE.OrderDTOToOrder(orderDTO);
        System.out.println(order);
    }
}
