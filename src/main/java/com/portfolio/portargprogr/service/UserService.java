package com.portfolio.portargprogr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portargprogr.model.User;
import com.portfolio.portargprogr.repository.UserRepository;

@Service
public class UserService implements IUserService{

  // Inyección de dependencias más utilizada
  @Autowired
  public UserRepository userRepo;

  @Override
  public List<User> listUser() {
    return userRepo.findAll();
  }

  @Override
  public void storeUser(User iden) {
    userRepo.save(iden);
  }

  @Override
  public void updateUser(User iden, Long id) {
    userRepo.save(iden);
    
  }

  @Override
  public User findUser(Long id) {
    return userRepo.findById(id).orElse(null);
  }

  @Override
  public void deleteUser(Long id) {
    userRepo.deleteById(id);
  }
}
