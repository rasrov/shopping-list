package com.rasrov.shopping.list.domain.serviceport;

import com.rasrov.shopping.list.domain.entity.MarketEntity;

import java.util.List;

public interface MarketServicePort {

    void saveMarkets(List<MarketEntity> marketEntities);

}
