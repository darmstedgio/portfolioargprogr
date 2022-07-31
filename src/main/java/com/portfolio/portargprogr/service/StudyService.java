package com.portfolio.portargprogr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portargprogr.model.Study;
import com.portfolio.portargprogr.repository.StudyRepository;

@Service
public class StudyService implements IStudyService{

  // Inyección de dependencias más utilizada
  @Autowired
  public StudyRepository studRepo;

  @Override
  public List<Study> listStudy() {
    return studRepo.findAll();
  }

  @Override
  public void storeStudy(Study stud) {
    studRepo.save(stud);
  }

  @Override
  public void updateStudy(Study stud, Long id) {
    studRepo.save(stud);
    
  }

  @Override
  public Study findStudy(Long id) {
    return studRepo.findById(id).orElse(null);
  }

  @Override
  public void deleteStudy(Long id) {
    studRepo.deleteById(id);
  }
}
