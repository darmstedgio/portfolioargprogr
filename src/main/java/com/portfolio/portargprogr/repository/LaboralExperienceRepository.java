package com.portfolio.portargprogr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portargprogr.model.LaboralExperience;

@Repository
public interface LaboralExperienceRepository extends JpaRepository<LaboralExperience, Long>{
  
}
