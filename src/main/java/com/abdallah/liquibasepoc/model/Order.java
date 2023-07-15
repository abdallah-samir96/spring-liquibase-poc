package com.abdallah.liquibasepoc.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "orders")
public class Order extends BaseEntity{

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "order_id")
    private List<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
