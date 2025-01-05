package com.rasrov.shopping.list.infrastructure.repository;

import com.rasrov.shopping.list.domain.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartRepository extends JpaRepository<CartEntity, UUID> {
}
