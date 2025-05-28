package com.mjenn.hexagonal_poc.mvc.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mjenn.hexagonal_poc.mvc.products.model.ProductDto;
import com.mjenn.hexagonal_poc.mvc.products.repository.ProductRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> new ProductDto(product.getName(), product.getPrice()))
                .toList();
    }

}
