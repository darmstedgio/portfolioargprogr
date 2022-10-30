package com.portfolio.portargprogr.service;

import com.portfolio.portargprogr.model.AboutMe;
import com.portfolio.portargprogr.model.LaboralExperience;
import com.portfolio.portargprogr.repository.AboutMeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutMeService implements IAboutMeService{

  // Inyección de dependencias más utilizada
  @Autowired
  public AboutMeRepository aboutMe;

  @Override
  public List<AboutMe> listAboutMe() {
    return aboutMe.findAll();
  }

  @Override
  public void storeAboutMe(AboutMe aboutme) {
    aboutMe.save(aboutme);
  }

  @Override
  public void updateAboutMe(AboutMe aboutme, Long id) {
    aboutMe.save(aboutme);
  }

  @Override
  public AboutMe findAboutMe(Long id) {
    return aboutMe.findById(id).orElse(null);
  }

  @Override
  public void deleteAboutMe(Long id) {
    aboutMe.deleteById(id);
  }
}
