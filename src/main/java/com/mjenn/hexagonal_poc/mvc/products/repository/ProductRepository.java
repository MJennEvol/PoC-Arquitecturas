package com.mjenn.hexagonal_poc.mvc.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjenn.hexagonal_poc.mvc.products.model.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
