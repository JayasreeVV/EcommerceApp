package com.ecommerce.shoppingcart.service.admin.category;

import com.ecommerce.shoppingcart.dto.CategoryDto;
import com.ecommerce.shoppingcart.entity.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(CategoryDto categoryDto);
    List<Category> getAllCategories();
}
