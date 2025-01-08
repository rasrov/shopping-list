package com.rasrov.shopping.list.infrastructure.adapter;

import com.rasrov.shopping.list.domain.entity.CartEntity;
import com.rasrov.shopping.list.domain.serviceport.CartServicePort;
import com.rasrov.shopping.list.infrastructure.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartAdapter implements CartServicePort {

    private final CartRepository cartRepository;

    public CartAdapter(final CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public List<CartEntity> saveCart(final List<CartEntity> cartItems) {
        return this.cartRepository.saveAll(cartItems);
    }
}
