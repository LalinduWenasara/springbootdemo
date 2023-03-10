package com.example.productdemo.repository;
import com.example.productdemo.entity.PriceStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceStatusRepository  extends JpaRepository<PriceStatusEntity, Long> {
}
