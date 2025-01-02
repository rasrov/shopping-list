package com.rasrov.shopping.list.domain.serviceport;

import com.rasrov.shopping.list.domain.entity.ProductsOfferEntity;

import java.util.List;

public interface ProductOfferServicePort {

    List<ProductsOfferEntity> getAllProductsOffer();

    void saveProductsOffer(List<ProductsOfferEntity> productsOffer);

}
