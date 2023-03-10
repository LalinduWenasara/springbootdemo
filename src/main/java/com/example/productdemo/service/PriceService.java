package com.example.productdemo.service;

import com.example.productdemo.entity.PriceEntity;
import com.example.productdemo.entity.UserEntity;

import java.util.List;
import java.util.Optional;
public interface PriceService {


    List <PriceEntity> findAllPrices();

    Optional<PriceEntity> findById(Long user_id);

    PriceEntity savePrice(PriceEntity priceEntity);

    PriceEntity updatePrice(PriceEntity priceEntity);
    void deletePrice(Long product_id);

}
