package com.shopping.list.adapter;

import com.rasrov.shopping.list.entity.Cart;
import com.rasrov.shopping.list.entity.CartEntity;
import com.rasrov.shopping.list.serviceport.CartServicePort;
import com.shopping.list.api.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceAdapter implements CartService {

    @Override
    public void saveCart(final Cart cart) {
    }

    private List<CartEntity> buildCartEntities(final Cart cart) {
        return cart.getProductName().stream()
                .map(productName -> new CartEntity(productName, true))
                .toList();
    }
}
