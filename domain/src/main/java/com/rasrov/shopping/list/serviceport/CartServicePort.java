package com.rasrov.shopping.list.serviceport;

import com.rasrov.shopping.list.entity.CartEntity;

import java.util.List;

public interface CartServicePort {

    List<CartEntity> saveCart(List<CartEntity> cartItems);

}
