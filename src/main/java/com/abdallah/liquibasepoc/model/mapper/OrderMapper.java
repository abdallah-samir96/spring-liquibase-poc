package com.abdallah.liquibasepoc.model.mapper;

import com.abdallah.liquibasepoc.model.Order;
import com.abdallah.liquibasepoc.model.Product;
import com.abdallah.liquibasepoc.model.dto.OrderDTO;
import com.abdallah.liquibasepoc.model.dto.ProductDTO;
import com.abdallah.liquibasepoc.model.enums.Size;

import java.util.List;

public class OrderMapper {
    public OrderDTO toDTO(Order order){
        var orderDTO = new OrderDTO();
        orderDTO.setName(order.getName());
        return orderDTO;
    }

    public Order toEntity(OrderDTO orderDTO){
        var order = new Order();
        var products = getProductList();
        order.setName(orderDTO.getName());
        order.setProducts(products);
        return order;
    }

    private List<Product> getProductList(){
        var productOne = new Product();
        productOne.setSize(Size.LARGE);
        productOne.setPrice(1200);
        productOne.setName("Bage");
//***********************************************
        var productTwo = new Product();
        productTwo.setSize(Size.MEDIUM);
        productTwo.setPrice(1500);
        productTwo.setName("TV");

        return List.of(
                productOne,productTwo
        );
    }
}
