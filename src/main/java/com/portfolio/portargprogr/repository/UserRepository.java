package com.portfolio.portargprogr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portargprogr.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  
}
