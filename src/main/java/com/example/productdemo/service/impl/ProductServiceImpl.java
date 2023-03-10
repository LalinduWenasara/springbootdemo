package com.example.productdemo.service.impl;

import com.example.productdemo.entity.ProductEntity;
import com.example.productdemo.repository.ProductRepository;
import com.example.productdemo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<ProductEntity> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findById(Long product_id) {
        System.out.println("product service hit");
      return  productRepository.findById(product_id);

    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public void deleteProduct(Long product_id) {
        productRepository.deleteById(product_id);

    }

    @Override
    public String getProductActive() {
        String product=productRepository.getProductsActive();
       // product="service called";
        return product;
    }
}
