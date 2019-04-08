package com.jj.halterocms.repository;


import com.jj.halterocms.domain.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository layer for competition.
 */
@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Integer> {
}
