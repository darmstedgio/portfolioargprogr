package com.portfolio.portargprogr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portargprogr.model.Identity;

@Repository
public interface IdentityRepository extends JpaRepository<Identity, Long>{
  // @Query("SELECT * FORM IDENTITY i JOIN i.users u")
  // public List<Identity> getJoinInformation();
}
