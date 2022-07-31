package com.portfolio.portargprogr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portargprogr.model.Study;

@Repository
public interface StudyRepository extends JpaRepository<Study, Long>{
  
}
