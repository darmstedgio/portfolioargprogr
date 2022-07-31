package com.portfolio.portargprogr.service;
import com.portfolio.portargprogr.model.User;
import java.util.List;

public interface IUserService{
 public List<User> listUser();
  public void storeUser (User user);
  public void updateUser (User user, Long id);
  public void deleteUser (Long id);
  public User findUser (Long id); 
}
