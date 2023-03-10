package com.example.productdemo.service.impl;

import com.example.productdemo.entity.PriceStatusEntity;
import com.example.productdemo.repository.PriceStatusRepository;
import com.example.productdemo.service.PriceStatusService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceStatusServiceImpl implements PriceStatusService {

    private final PriceStatusRepository priceStatusRepository;

    public PriceStatusServiceImpl(PriceStatusRepository priceStatusRepository) {
        this.priceStatusRepository = priceStatusRepository;
    }

    @Override
    public List<PriceStatusEntity> findAllPriceStatus() {
        return priceStatusRepository.findAll();
    }

    @Override
    public Optional<PriceStatusEntity> findById(Long price_status_id) {
        return  priceStatusRepository.findById(price_status_id);
    }

    @Override
    public PriceStatusEntity savePriceStatus(PriceStatusEntity priceStatusEntity) {
        return priceStatusRepository.save(priceStatusEntity);
    }

    @Override
    public PriceStatusEntity updatePriceStatus(PriceStatusEntity priceStatusEntity) {
        return priceStatusRepository.save(priceStatusEntity);
    }

    @Override
    public void deletetPriceStatus(Long price_status_id) {

    }


}
