package com.rasrov.shopping.list.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "PRODUCT_OFFER")
public class ProductsOfferEntity extends CartEntity {

    @Column(name = "date_start")
    private LocalDate dateStart;

    @Column(name = "date_end")
    private Local dateEnd;

    @Column(name = "original_price")
    private Double originalPrice;

    @Column(name = "discounted_price")
    private Double discountedPrice;

}
