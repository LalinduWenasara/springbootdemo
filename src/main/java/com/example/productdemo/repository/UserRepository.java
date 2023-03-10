package com.example.productdemo.repository;
import org.springframework.stereotype.Repository;
import com.example.productdemo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, Long> {



        }

