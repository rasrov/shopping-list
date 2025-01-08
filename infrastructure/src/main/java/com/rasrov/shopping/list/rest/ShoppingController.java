package com.rasrov.shopping.list.rest;

import com.rasrov.shopping.list.api.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cart")
public class ShoppingController {

    private final CartService cartService;

    public ShoppingController(final CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public ResponseEntity<Void> saveCart(@RequestBody final List<String> products) {
        cartService.saveCart(products);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
