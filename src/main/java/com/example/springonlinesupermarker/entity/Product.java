package com.example.springonlinesupermarker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue

    String id ;


    @Column(name="name")
            @NotBlank(message = "name is required")
        String name;
    @Column(name="category")
    @NotBlank(message = "category is required")
        String category;
    @Column(name = "inStock")
    @NotBlank(message = "stock is required")
        Boolean inStock;
    @Column(name = "brand")
    @NotBlank(message = "brand is required")
        String brand;
    @Column(name = "prince")
    @NotBlank(message = "price is required")
        Double Price;
    @Column(name="updatePrice")
    @NotBlank(message = "updatePrice is required")
        Double updatePrice;
}
