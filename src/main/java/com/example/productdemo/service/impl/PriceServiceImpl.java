package com.example.productdemo.service.impl;

import com.example.productdemo.entity.PriceEntity;
import com.example.productdemo.service.PriceService;
import com.example.productdemo.repository.PriceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceServiceImpl implements PriceService {


    private final PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }


    @Override
    public List<PriceEntity> findAllPrices() {
        return priceRepository.findAll();
    }

    @Override
    public Optional<PriceEntity> findById(Long price_id) {
        return  priceRepository.findById(price_id);
    }

    @Override
    public PriceEntity savePrice(PriceEntity priceEntity) {
        return priceRepository.save(priceEntity);
    }

    @Override
    public PriceEntity updatePrice(PriceEntity priceEntity) {
        return priceRepository.save(priceEntity);
    }

    @Override
    public void deletePrice(Long product_id) {

    }
}
