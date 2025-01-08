package com.rasrov.shopping.list.adapter;

import com.rasrov.shopping.list.entity.CartEntity;
import com.rasrov.shopping.list.api.CartService;
import com.rasrov.shopping.list.serviceport.CartServicePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceAdapter implements CartService {

    private final CartServicePort cartServicePort;

    public CartServiceAdapter(final CartServicePort cartServicePort) {
        this.cartServicePort = cartServicePort;
    }

    @Override
    public void saveCart(final List<String> products) {
        this.cartServicePort.saveCart(buildCartEntities(products));
    }

    private List<CartEntity> buildCartEntities(final List<String> products) {
        return products.stream()
                .map(productName -> new CartEntity(productName, true))
                .toList();
    }
}
