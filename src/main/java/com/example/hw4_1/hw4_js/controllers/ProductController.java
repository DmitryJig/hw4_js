package com.example.hw4_1.hw4_js.controllers;

import com.example.hw4_1.hw4_js.models.Product;
import com.example.hw4_1.hw4_js.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable Long id){
        return productService.findProductById(id).get();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping
    public void deleteProduct(@RequestParam Long id){
        productService.deleteById(id);
    }
}
