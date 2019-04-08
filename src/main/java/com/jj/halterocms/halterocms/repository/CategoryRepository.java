package com.jj.halterocms.halterocms.repository;


import com.jj.halterocms.halterocms.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository layer for athlete.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
