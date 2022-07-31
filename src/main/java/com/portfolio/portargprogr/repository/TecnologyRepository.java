package com.portfolio.portargprogr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portargprogr.model.Tecnology;

@Repository
public interface TecnologyRepository extends JpaRepository<Tecnology, Long>{
  
}
