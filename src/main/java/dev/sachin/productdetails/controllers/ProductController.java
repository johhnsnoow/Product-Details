package dev.sachin.productdetails.controllers;

import dev.sachin.productdetails.models.Product;
import dev.sachin.productdetails.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/products")
public class ProductController {

    private ProductService _productService;

    public ProductController(ProductService productService) {
        _productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return _productService.getProductById(id);
    }

    @GetMapping()
    public List<Product> getProducts() {
        return _productService.getProducts();
    }
}
