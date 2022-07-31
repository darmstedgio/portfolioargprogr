package com.portfolio.portargprogr.service;
import com.portfolio.portargprogr.model.Study;
import java.util.List;

public interface IStudyService{
 public List<Study> listStudy();
  public void storeStudy (Study study);
  public void updateStudy (Study study, Long id);
  public void deleteStudy (Long id);
  public Study findStudy (Long id); 
}
