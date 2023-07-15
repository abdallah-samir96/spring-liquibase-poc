package com.abdallah.liquibasepoc.service;

import com.abdallah.liquibasepoc.model.Product;
import com.abdallah.liquibasepoc.model.dto.ProductDTO;
import com.abdallah.liquibasepoc.model.exceptions.NotFoundException;
import com.abdallah.liquibasepoc.model.mapper.ProductMapper;
import com.abdallah.liquibasepoc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public String add(ProductDTO productDTO){

        var mapper = new ProductMapper();
        var product = mapper.toEntity(productDTO);
        productRepository.save(product);
        return "ok";
    }

    public List<Product> list() {

        // here i return all Products without Pagination which is for POC only
        return productRepository.findAll();
    }

    public Product getById(long id){

      var productOptional = productRepository.findById(id);
      return productOptional.orElseThrow(()-> new NotFoundException("product with id "+ id + " IS not Found",404));
    }


}
