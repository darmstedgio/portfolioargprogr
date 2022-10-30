package com.portfolio.portargprogr.service;

import com.portfolio.portargprogr.model.AboutMe;

import java.util.List;

public interface IAboutMeService {
 public List<AboutMe> listAboutMe();
  public void storeAboutMe (AboutMe tecn);
  public void updateAboutMe (AboutMe tecn, Long id);
  public void deleteAboutMe (Long id);
  public AboutMe findAboutMe (Long id);
}
