package com.rasrov.shopping.list.serviceport;

import com.rasrov.shopping.list.entity.ProductsOfferEntity;

import java.util.List;

public interface ProductOfferServicePort {

    List<ProductsOfferEntity> getAllProductsOffer();

    void saveProductsOffer(List<ProductsOfferEntity> productsOffer);

}
