package com.rasrov.shopping.list.infrastructure.rest;

import com.rasrov.shopping.list.domain.entity.Cart;
import com.shopping.list.api.CartService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cart")
public class ShoppingController {

    private final CartService cartService;

    public ShoppingController(final CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public ResponseEntity<Void> saveCart(@Valid @RequestBody final Cart cart) {
        this.cartService.saveCart(cart);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
