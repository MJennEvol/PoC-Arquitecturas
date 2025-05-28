package com.mjenn.hexagonal_poc.mvc.products.service;

import java.util.List;

import com.mjenn.hexagonal_poc.mvc.products.model.ProductDto;

public interface ProductService {

    List<ProductDto> getAllProducts();

}
