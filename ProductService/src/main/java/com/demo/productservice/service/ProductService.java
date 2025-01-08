package com.demo.productservice.service;

import com.demo.productservice.entity.Category;
import com.demo.productservice.entity.Product;

import java.util.List;

public interface ProductService {
    public void addProduct(     String productName, String productDescription, Category productCategory, double productPrice, double productQty);
    public Product getProduct(int productId);
    public List<Product> getAllProducts();
}
