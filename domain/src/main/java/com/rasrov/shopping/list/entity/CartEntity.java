package com.rasrov.shopping.list.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "CART")
public class CartEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "active")
    private Boolean active;

    public CartEntity() {
    }

    public CartEntity(String productName, Boolean active) {
        this.productName = productName;
        this.active = active;
    }
}