package com.example.exam.service;

import com.example.exam.model.entity.Category;
import com.example.exam.model.entity.enums.CategoryNameEnum;

public interface CategoryService {
    void initCategories();

    Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum);
}
