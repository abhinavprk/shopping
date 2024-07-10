package com.ecommerce.shopping.repository;

import com.ecommerce.shopping.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

    List<Products> deleteByIdAllIgnoreCase(@NonNull int id);
}
