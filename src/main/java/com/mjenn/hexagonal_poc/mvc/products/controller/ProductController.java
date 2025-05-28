package com.mjenn.hexagonal_poc.mvc.products.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.mjenn.hexagonal_poc.mvc.products.service.ProductService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
    

}
