package com.jj.halterocms.repository;

import com.jj.halterocms.domain.Bout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository layer for athlete.
 */
@Repository
public interface BoutRepository extends JpaRepository<Bout, Integer> {
}
