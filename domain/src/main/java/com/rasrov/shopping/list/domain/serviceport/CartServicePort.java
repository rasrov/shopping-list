package com.rasrov.shopping.list.domain.serviceport;

import com.rasrov.shopping.list.domain.entity.CartEntity;

import java.util.List;

public interface CartServicePort {

    List<CartEntity> saveCart(List<CartEntity> cartItems);

}
