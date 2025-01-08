package com.demo.productservice.service;

import com.demo.productservice.entity.Category;
import com.demo.productservice.entity.Product;
import com.demo.productservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;


    @Override
    public void addProduct(String productName, String productDescription, Category productCategory, double productPrice, double productQty) {
        Product product = new Product();
        product.setProductName(productName);
        product.setProductDescription(productDescription);
        product.setProductCategory(productCategory);
        product.setProductPrice(productPrice);
        product.setProductQty(productQty);
        product.setUpdatedAt(new Date());
        product.setCreatedAt(new Date());

        productRepo.addProduct(product);
    }

    @Override
    public Product getProduct(int productId) {
        return productRepo.getProduct(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.getAllProducts();
    }

}
