package com.jra.pma.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jra.pma.models.exam.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
