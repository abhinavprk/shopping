package com.ecommerce.shopping.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brand;
    private String category;
    private BigDecimal price;
    private LocalDate releaseDate;
    private boolean available;
    private int quantity;
    private String imageType;
    private String imageName;

    @Lob
    private byte[] imageData;

}
