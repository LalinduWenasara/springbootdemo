package com.example.productdemo.service;

import com.example.productdemo.entity.PriceStatusEntity;
import com.example.productdemo.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface PriceStatusService {

    List<PriceStatusEntity> findAllPriceStatus();

    Optional<PriceStatusEntity> findById(Long price_status_id);
    PriceStatusEntity savePriceStatus(PriceStatusEntity priceStatusEntity);

    PriceStatusEntity updatePriceStatus(PriceStatusEntity priceStatusEntity);
    void deletetPriceStatus(Long price_status_id);


}
