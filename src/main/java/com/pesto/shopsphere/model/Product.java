package com.pesto.shopsphere.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseModel {

    @ManyToOne
    private Category category;
    private String name;
    private double price;
    private int quantity;
    private String image;
    private String description;

}
