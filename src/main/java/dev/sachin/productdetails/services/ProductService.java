package dev.sachin.productdetails.services;

import dev.sachin.productdetails.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getProducts();
}
