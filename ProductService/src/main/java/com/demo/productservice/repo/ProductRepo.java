package com.demo.productservice.repo;

import com.demo.productservice.entity.Category;
import com.demo.productservice.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo {
    List<Category> categories = new ArrayList<>();
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if(products == null) {
            product.setId(1);
        }else {
            product.setId(products.size() + 1);
        }

        products.add(product);
    }

    public Product getProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void addCategory(Category category) {
        if(categories == null) {
            category.setId(1);
        }
        else{
            category.setId(categories.size() + 1);
        }

        categories.add(category);
    }

    public List<Category> getAllCategories() {
        return categories;
    }

    public Category getCategory(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
