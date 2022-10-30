package com.portfolio.portargprogr.repository;

import com.portfolio.portargprogr.model.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeRepository extends JpaRepository<AboutMe, Long>{
  
}
