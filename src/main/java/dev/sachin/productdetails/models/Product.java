package dev.sachin.productdetails.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
/**
 *
 */
public class Product extends BaseModel {

    /**
     *
     */
    private String title;

    /**
     *
     */
    private String description;

    /**
     *
     */
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Category category;

    /**
     *
     */
    private String imageUrl;

    /**
     *
     */
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Price price;
}
