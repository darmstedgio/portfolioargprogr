package com.portfolio.portargprogr.service;
import com.portfolio.portargprogr.model.Project;
import java.util.List;

public interface IProjectService{
 public List<Project> listProject();
  public void storeProject (Project proj);
  public void updateProject (Project proj, Long id);
  public void deleteProject (Long id);
  public Project findProject (Long id); 
}
