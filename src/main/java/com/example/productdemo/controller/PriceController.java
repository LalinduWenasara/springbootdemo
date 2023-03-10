package com.example.productdemo.controller;
import com.example.productdemo.entity.PriceEntity;
import com.example.productdemo.service.PriceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/price")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping
    public List<PriceEntity> findAllPrices(){
        return priceService.findAllPrices();
    }

    @GetMapping("/{id}")
    public Optional<PriceEntity> findPriceById(@PathVariable("id") Long product_id){
        System.out.println("product controller hit");
        return priceService.findById(product_id);
    }

    @PostMapping
    public PriceEntity savePrice(@RequestBody PriceEntity priceEntity){
        return priceService.savePrice(priceEntity);
    }
    @PutMapping
    public PriceEntity updatePrice(@RequestBody PriceEntity priceEntity) {
        return priceService.updatePrice(priceEntity);
    }

    @DeleteMapping("/{id}")
    public void deletePrice(@PathVariable("id") Long id) {
        priceService.deletePrice(id);
    }



}
