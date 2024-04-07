package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service

public class ProductService {

private final ProductRepository productRepository;


public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;

}

public void createProduct(Product product) {

    productRepository.save(product);
}

}
