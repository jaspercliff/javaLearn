package com.jasper.mapStruct.convert;

import com.jasper.pojo.goods.Order;
import com.jasper.pojo.goods.OrderDTO;
import com.jasper.pojo.goods.Product;
import com.jasper.pojo.goods.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderConvert {
    OrderConvert INSTANCE = Mappers.getMapper(OrderConvert.class);
    // orderDTO.product(productDTO)   ORDER.product(product)
    // 这里会自己调用下面的productDTOToProduct
    Order OrderDTOToOrder(OrderDTO orderDTO);

    @Mapping(target = "desc", source = "des")
    Product productDTOToProduct(ProductDTO productDTO);
}
