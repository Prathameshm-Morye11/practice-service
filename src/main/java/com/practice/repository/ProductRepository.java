package com.practice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.entity.Products;

public interface ProductRepository extends MongoRepository<Products, String> {

}
