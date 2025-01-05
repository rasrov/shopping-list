package com.rasrov.shopping.list.domain.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "PRODUCT_OFFER")
public class ProductsOfferEntity extends CartEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "date_start")
    private LocalDate dateStart;

    @Column(name = "date_end")
    private Local dateEnd;

    @ManyToOne
    @JoinColumn(name = "name")
    private String market;

    @Column(name = "original_price")
    private Double originalPrice;

    @Column(name = "discounted_price")
    private Double discountedPrice;

}
