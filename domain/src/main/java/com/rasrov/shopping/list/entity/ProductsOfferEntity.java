package com.rasrov.shopping.list.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "PRODUCT_OFFER")
public class ProductsOfferEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "date_start")
    private LocalDate dateStart;

    @Column(name = "date_end")
    private LocalDate dateEnd;

    @Column(name = "market")
    private String market;

    @Column(name = "original_price")
    private Double originalPrice;

    @Column(name = "discounted_price")
    private Double discountedPrice;
}
