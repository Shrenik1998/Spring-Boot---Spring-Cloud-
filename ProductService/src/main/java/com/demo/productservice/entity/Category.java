package com.demo.productservice.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category extends Base{
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
