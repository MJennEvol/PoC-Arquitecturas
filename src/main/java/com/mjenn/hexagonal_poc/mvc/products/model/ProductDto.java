package com.mjenn.hexagonal_poc.mvc.products.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductDto {
    private final String name;
    private final double price;
}
