package com.abdallah.liquibasepoc.controller;

import com.abdallah.liquibasepoc.model.Product;
import com.abdallah.liquibasepoc.model.dto.ProductDTO;
import com.abdallah.liquibasepoc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){

        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody ProductDTO productDTO){

        return ResponseEntity.ok(productService.add(productDTO));

    }

    @GetMapping
    public ResponseEntity<List<Product>> list(){

        return ResponseEntity.ok(productService.list());
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Product> getById(@PathVariable(name = "id") long id){

        return  ResponseEntity.ok(productService.getById(id));
    }
}
