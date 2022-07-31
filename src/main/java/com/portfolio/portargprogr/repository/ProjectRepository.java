package com.portfolio.portargprogr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portargprogr.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
  
}
