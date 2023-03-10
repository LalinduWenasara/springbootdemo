package com.example.productdemo.service;

import com.example.productdemo.entity.ProductEntity;
import com.example.productdemo.entity.UserEntity;
import com.example.productdemo.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> findAllUsers();
    Optional<UserEntity> findById(Long user_id);

    UserEntity saveUser(UserEntity userEntity);

    UserEntity updateUser(UserEntity userEntity);
    void deleteUser(Long product_id);



}
