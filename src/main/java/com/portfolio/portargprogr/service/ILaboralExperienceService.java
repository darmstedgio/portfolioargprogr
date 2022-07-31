package com.portfolio.portargprogr.service;
import com.portfolio.portargprogr.model.LaboralExperience;
import java.util.List;

public interface ILaboralExperienceService{
 public List<LaboralExperience> listLaboralExperience();
  public void storeLaboralExperience (LaboralExperience labExp);
  public void updateLaboralExperience (LaboralExperience labExp, Long id);
  public void deleteLaboralExperience (Long id);
  public LaboralExperience findLaboralExperience (Long id); 
}
