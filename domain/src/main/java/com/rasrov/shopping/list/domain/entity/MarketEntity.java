package com.rasrov.shopping.list.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARKET")
public class MarketEntity {

    @Id
    @Column(name = "name")
    private String name;

}
