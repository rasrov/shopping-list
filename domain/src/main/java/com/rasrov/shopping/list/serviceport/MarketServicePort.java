package com.rasrov.shopping.list.serviceport;

import com.rasrov.shopping.list.entity.MarketEntity;

import java.util.List;

public interface MarketServicePort {

    void saveMarkets(List<MarketEntity> marketEntities);

}
