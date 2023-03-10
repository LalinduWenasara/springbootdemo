package com.example.productdemo.service;

import com.example.productdemo.entity.ProductEntity;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductEntity> findAllProducts();
    Optional<ProductEntity> findById(Long product_id);
    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity updateProduct(ProductEntity productEntity);
    void deleteProduct(Long product_id);

    String getProductActive();

}
