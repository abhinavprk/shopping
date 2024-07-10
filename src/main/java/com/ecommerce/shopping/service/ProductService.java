package com.ecommerce.shopping.service;

import com.ecommerce.shopping.model.Products;
import com.ecommerce.shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }




    public List<Products> createProduct(List <Products> products) {
        return productRepository.saveAll(products);
    }

    public int deleteProduct(int id) {
        productRepository.deleteById(id);
        return id;
    }

    public Products getProductById(int id) {
        Optional<Products> opt =  productRepository.findById(id);
        return opt.orElse(null);

    }

    public List<Products> getAllProducts() {
       return productRepository.findAll();

    }
}
