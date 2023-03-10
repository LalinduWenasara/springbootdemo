package com.example.productdemo.repository;

import com.example.productdemo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
//long because we used long as primary key in product entity
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

 @Query(value="SELECT product_name  From mt_product Where product_id>2;",nativeQuery = true)
    public String getProductsActive();
}
