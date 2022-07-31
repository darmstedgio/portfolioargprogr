package com.portfolio.portargprogr.service;
import com.portfolio.portargprogr.model.Tecnology;
import java.util.List;

public interface ITecnologyService{
 public List<Tecnology> listTecnology();
  public void storeTecnology (Tecnology tecn);
  public void updateTecnology (Tecnology tecn, Long id);
  public void deleteTecnology (Long id);
  public Tecnology findTecnology (Long id); 
}
