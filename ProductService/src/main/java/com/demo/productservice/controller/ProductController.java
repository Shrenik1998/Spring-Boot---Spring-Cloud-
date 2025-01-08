package com.demo.productservice.controller;

import com.demo.productservice.dtos.ProductDto;
import com.demo.productservice.entity.Product;
import com.demo.productservice.service.AuthenticateUser;
import com.demo.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private AuthenticateUser authenticateUser;

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id,
                                                  @RequestParam String username,
                                                  @RequestParam String password) {
        try{
            if(!authenticateUser.authenticate(username,password)){
                return ResponseEntity.status(401).body(null);
            }
            Product product = productService.getProduct(id);
            return ResponseEntity.status(200).body(product);
        }catch (Exception e){
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts(@RequestParam String username,@RequestParam String password) {
        try {
            if(!authenticateUser.authenticate(username,password)){
                return ResponseEntity.status(401).body(null);
            }
            List<Product> products = productService.getAllProducts();
            return ResponseEntity.status(200).body(products);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    @PostMapping("/")
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto,@RequestParam String username,@RequestParam String password) {
        try{
            if(!authenticateUser.authenticate(username,password)){
                return ResponseEntity.status(401).body(null);
            }
            productService.addProduct(productDto.getProductName(),productDto.getProductDescription(),null,productDto.getProductPrice(),productDto.getProductQty());
            return ResponseEntity.status(201).body("Product Created Successfully");
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }
}
