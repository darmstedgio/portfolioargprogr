package com.portfolio.portargprogr.service;
import com.portfolio.portargprogr.model.Identity;
import java.util.List;

public interface IIdentityService{
 public List<Identity> listIdentity();
  public void storeIdentity (Identity iden);
  public void updateIdentity (Identity iden, Long id);
  public void deleteIdentity (Long id);
  public Identity findIdentity (Long id); 
}
