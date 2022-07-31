package com.portfolio.portargprogr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portargprogr.model.Tecnology;
import com.portfolio.portargprogr.repository.TecnologyRepository;

@Service
public class TecnologyService implements ITecnologyService{

  // Inyección de dependencias más utilizada
  @Autowired
  public TecnologyRepository tecnRepo;

  @Override
  public List<Tecnology> listTecnology() {
    return tecnRepo.findAll();
  }

  @Override
  public void storeTecnology(Tecnology tecn) {
    tecnRepo.save(tecn);
  }

  @Override
  public void updateTecnology(Tecnology tecn, Long id) {
    tecnRepo.save(tecn);
    
  }

  @Override
  public Tecnology findTecnology(Long id) {
    return tecnRepo.findById(id).orElse(null);
  }

  @Override
  public void deleteTecnology(Long id) {
    tecnRepo.deleteById(id);
  }
}
