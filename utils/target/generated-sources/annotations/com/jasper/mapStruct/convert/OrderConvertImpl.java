package com.jasper.mapStruct.convert;

import com.jasper.pojo.goods.Order;
import com.jasper.pojo.goods.OrderDTO;
import com.jasper.pojo.goods.Product;
import com.jasper.pojo.goods.ProductDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-24T15:50:48+0800",
    comments = "version: 1.6.0, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Arch Linux)"
)
public class OrderConvertImpl implements OrderConvert {

    @Override
    public Order OrderDTOToOrder(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setCustomer( orderDTO.getCustomer() );
        order.setId( (long) orderDTO.getId() );
        order.setProduct( productDTOListToProductList( orderDTO.getProduct() ) );

        return order;
    }

    @Override
    public Product productDTOToProduct(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        String desc = null;
        long id = 0L;
        String name = null;

        desc = productDTO.getDes();
        id = productDTO.getId();
        name = productDTO.getName();

        Product product = new Product( id, name, desc );

        return product;
    }

    protected List<Product> productDTOListToProductList(List<ProductDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Product> list1 = new ArrayList<Product>( list.size() );
        for ( ProductDTO productDTO : list ) {
            list1.add( productDTOToProduct( productDTO ) );
        }

        return list1;
    }
}
