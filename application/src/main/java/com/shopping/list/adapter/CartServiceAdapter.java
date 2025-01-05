package com.shopping.list.adapter;

import com.rasrov.shopping.list.domain.entity.Cart;
import com.rasrov.shopping.list.domain.entity.CartEntity;
import com.rasrov.shopping.list.domain.serviceport.CartServicePort;
import com.shopping.list.api.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceAdapter implements CartService {

    private final CartServicePort cartServicePort;

    public CartServiceAdapter(final CartServicePort cartServicePort) {
        this.cartServicePort = cartServicePort;
    }

    @Override
    public void saveCart(final Cart cart) {
        this.cartServicePort.saveCart(buildCartEntities(cart));
    }

    private List<CartEntity> buildCartEntities(final Cart cart) {
        return cart.getProductName().stream()
                .map(productName -> new CartEntity(productName, true))
                .toList();
    }
}
