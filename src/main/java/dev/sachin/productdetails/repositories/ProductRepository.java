package dev.sachin.productdetails.repositories;

import dev.sachin.productdetails.models.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.function.Function;

@Repository
/**
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByTitleEquals(String title);

    Product findByTitleEqualsAndPrice_Price(String title, double price);
}
