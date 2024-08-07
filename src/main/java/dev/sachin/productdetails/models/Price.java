package dev.sachin.productdetails.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Price extends BaseModel {
    private String currency;
    private double price;
}
