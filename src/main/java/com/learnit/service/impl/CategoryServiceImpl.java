package com.learnit.service.impl;

import com.learnit.model.po.Category;
import com.learnit.repository.CategoryRepository;
import com.learnit.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> addCategories(List<Category> categories) {
        //todo 校验分类名称是否存在
        for (Category category : categories) {
            System.out.print("uuid" + UUID.randomUUID());
            UUID uuid = UUID.randomUUID();
            category.setCategoryId(UUID.randomUUID());
        }
        categoryRepository.saveAll(categories);
        return categories;
    }

    @Override
    public void deleteCategory(UUID categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
