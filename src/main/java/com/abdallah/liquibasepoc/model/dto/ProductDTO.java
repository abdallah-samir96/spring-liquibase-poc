package com.abdallah.liquibasepoc.model.dto;

import com.abdallah.liquibasepoc.model.enums.Size;

public class ProductDTO {
    private String name;
    private long price;

    private Size size;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
