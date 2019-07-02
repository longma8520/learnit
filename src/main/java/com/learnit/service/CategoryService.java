package com.learnit.service;

import com.learnit.model.po.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {

    /**
     * 新增职业分类
     *
     * @param categories 职业分类
     * @return 职业分类
     */
    List<Category> addCategories(List<Category> categories);

    /**
     * 删除职业分类
     *
     * @param categoryId 职业分类ID
     */
    void deleteCategory(UUID categoryId);
}
