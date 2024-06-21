package com.pesto.shopsphere.repository;

import com.pesto.shopsphere.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category save(Category category);
}
