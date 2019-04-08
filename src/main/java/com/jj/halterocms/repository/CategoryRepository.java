package com.jj.halterocms.repository;


import com.jj.halterocms.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository layer for athlete.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
