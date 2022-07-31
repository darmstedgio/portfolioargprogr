package com.portfolio.portargprogr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portargprogr.model.Identity;
import com.portfolio.portargprogr.repository.IdentityRepository;

@Service
public class IdentityService implements IIdentityService{

  // Inyección de dependencias más utilizada
  @Autowired
  public IdentityRepository idenRepo;

  @Override
  public List<Identity> listIdentity() {
    return idenRepo.findAll();
  }

  @Override
  public void storeIdentity(Identity iden) {
    idenRepo.save(iden);
  }

  @Override
  public void updateIdentity(Identity iden, Long id) {
    idenRepo.save(iden);
    
  }

  @Override
  public Identity findIdentity(Long id) {
    return idenRepo.findById(id).orElse(null);
  }

  @Override
  public void deleteIdentity(Long id) {
    idenRepo.deleteById(id);
  }
}
