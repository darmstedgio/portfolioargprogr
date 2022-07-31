package com.portfolio.portargprogr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portargprogr.model.LaboralExperience;
import com.portfolio.portargprogr.repository.LaboralExperienceRepository;

@Service
public class LaboralExperienceService implements ILaboralExperienceService{

  // Inyección de dependencias más utilizada
  @Autowired
  public LaboralExperienceRepository labExper;

  @Override
  public List<LaboralExperience> listLaboralExperience() {
    return labExper.findAll();
  }

  @Override
  public void storeLaboralExperience(LaboralExperience labexp) {
    labExper.save(labexp);
  }

  @Override
  public void updateLaboralExperience(LaboralExperience labexp, Long id) {
    labExper.save(labexp);
    
  }

  @Override
  public LaboralExperience findLaboralExperience(Long id) {
    return labExper.findById(id).orElse(null);
  }

  @Override
  public void deleteLaboralExperience(Long id) {
    labExper.deleteById(id);
  }
}
