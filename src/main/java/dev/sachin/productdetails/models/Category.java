package dev.sachin.productdetails.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category extends BaseModel {
    @Column
    private String name;
    @Column
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();
}
