package com.rasrov.shopping.list.domain.entity;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public class Cart {

    @NotNull(message = "Product lists can not be null or empty")
    private List<String> productName;

    public List<String> getProductName() {
        return productName;
    }
}
