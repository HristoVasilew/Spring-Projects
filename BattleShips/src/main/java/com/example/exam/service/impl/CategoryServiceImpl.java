package com.example.exam.service.impl;

import com.example.exam.model.entity.Category;
import com.example.exam.model.entity.enums.CategoryNameEnum;
import com.example.exam.repository.CategoryRepository;
import com.example.exam.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public void initCategories() {

        if (categoryRepository.count() != 0){
            return;
        }

        Arrays.stream(CategoryNameEnum.values())
                .forEach(categoryNameEnum -> {
                    Category category = new Category();
                    category.setName(categoryNameEnum);

                    switch (categoryNameEnum){
                        case CARGO -> category.setDescription("A cargo ship or freighter is a merchant ship that carries cargo, goods, and materials from one port to another. Thousands of cargo carriers ply the world's");
                        case BATTLE -> category.setDescription("A battleship is a large armored warship with a main battery consisting of large caliber guns. It dominated naval warfare in the late 19th and early 20th ..");
                        case PATROL -> category.setDescription("A patrol boat (also referred to as a patrol craft, patrol ship or patrol vessel) is a relatively small naval vessel generally designed for coastal defence, ...");
                    }

                    categoryRepository.save(category);
                });


    }

    @Override
    public Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum) {
        return categoryRepository
                .findByName(categoryNameEnum)
                .orElse(null);
    }
}
