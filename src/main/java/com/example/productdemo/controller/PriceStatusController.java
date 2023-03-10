package com.example.productdemo.controller;
import com.example.productdemo.entity.PriceStatusEntity;
import com.example.productdemo.service.PriceStatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/priceStatus")
public class PriceStatusController {

    final PriceStatusService priceStatusService;

    public PriceStatusController(PriceStatusService priceStatusService) {
        this.priceStatusService = priceStatusService;
    }

    @GetMapping
    public List<PriceStatusEntity> findAllPriceStatus(){
        return priceStatusService.findAllPriceStatus();
    }

    @GetMapping("/{id}")
    public Optional<PriceStatusEntity> findPriceById(@PathVariable("id") Long product_id){
        System.out.println("product controller hit");
        return priceStatusService.findById(product_id);
    }

    @PostMapping
    public PriceStatusEntity savePriceStatus(@RequestBody PriceStatusEntity priceStatusEntity){
        return priceStatusService.savePriceStatus(priceStatusEntity);
    }
    @PutMapping
    public PriceStatusEntity updatePriceStatus(@RequestBody PriceStatusEntity priceStatusEntity) {
        return priceStatusService.updatePriceStatus(priceStatusEntity);
    }

    @DeleteMapping("/{id}")
    public void deletePriceStatus(@PathVariable("id") Long id) {
        priceStatusService.deletetPriceStatus(id);
    }




}
