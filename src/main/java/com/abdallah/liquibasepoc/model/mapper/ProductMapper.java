package com.abdallah.liquibasepoc.model.mapper;

import com.abdallah.liquibasepoc.model.Product;
import com.abdallah.liquibasepoc.model.dto.ProductDTO;

public class ProductMapper {

    public ProductDTO toDTO(Product product){
        var productDto = new ProductDTO();
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setSize(product.getSize());

        return productDto;
    }

   public Product toEntity(ProductDTO productDTO){
        var product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setSize(productDTO.getSize());
        return product;
    }
}
