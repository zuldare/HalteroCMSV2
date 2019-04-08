package com.jj.halterocms.halterocms.repository;

import com.wcms.weightliftingcms.domain.AthleteBout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository layer for athlete.
 */
@Repository
public interface AthleteBoutRepository extends JpaRepository<AthleteBout, Integer> {
}
