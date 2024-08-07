package dev.sachin.productdetails.services.impl;

import dev.sachin.productdetails.models.Product;
import dev.sachin.productdetails.services.ProductService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private RestTemplateBuilder _restTemplateBuilder;
    private String fakeStoreUrl = "https://fakestoreapi.com/products/{id}";
    private String fakeStoreUrlAllProducts = "https://fakestoreapi.com/products";

    public ProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        _restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public Product getProductById(Long id) {
        return new Product();
    }

    @Override
    public List<Product> getProducts() {
        return Collections.singletonList(new Product());
    }
}
