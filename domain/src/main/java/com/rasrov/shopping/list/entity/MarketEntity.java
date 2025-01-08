package com.rasrov.shopping.list.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MARKET")
public class MarketEntity {

    @Id
    @Column(name = "name")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String name;

}
