package com.abdallah.liquibasepoc.model;

import com.abdallah.liquibasepoc.model.enums.Size;
import jakarta.persistence.*;

@Entity(name = "product")
public class Product extends BaseEntity {


    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private long price;

    @Column(name = "size")
    @Enumerated(EnumType.STRING)
    private Size size;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
