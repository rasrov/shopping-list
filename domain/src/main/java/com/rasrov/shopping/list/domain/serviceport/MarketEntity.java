package com.rasrov.shopping.list.domain.serviceport;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "MARKET")
public class MarketEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "market")
    private String market;

}
