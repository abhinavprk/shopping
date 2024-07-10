package com.ecommerce.shopping.controller;

import com.ecommerce.shopping.model.Products;
import com.ecommerce.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/greeting")
    public String greetMe(){
        return "Hello from Customer Portal";
    }

    @PostMapping(value = "/products")
    public List<Products> createProducts(@RequestBody List<Products> products){
        return productService.createProduct(products);
    }

    @DeleteMapping(value = "/products/{id}")
    public int deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    @GetMapping(value = "/products/{id}")
    public Products findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @GetMapping(value = "/products")
    public List<Products> findAllProducts(){
        return productService.getAllProducts();
    }
}
