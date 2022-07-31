package com.portfolio.portargprogr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portargprogr.model.Project;
import com.portfolio.portargprogr.repository.ProjectRepository;

@Service
public class ProjectService implements IProjectService{

  // Inyección de dependencias más utilizada
  @Autowired
  public ProjectRepository projRepo;

  @Override
  public List<Project> listProject() {
    return projRepo.findAll();
  }

  @Override
  public void storeProject(Project proj) {
    projRepo.save(proj);
  }

  @Override
  public void updateProject(Project proj, Long id) {
    projRepo.save(proj);
    
  }

  @Override
  public Project findProject(Long id) {
    return projRepo.findById(id).orElse(null);
  }

  @Override
  public void deleteProject(Long id) {
    projRepo.deleteById(id);
  }
}
