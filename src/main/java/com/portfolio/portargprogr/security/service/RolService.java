package com.portfolio.portargprogr.security.service;

import com.portfolio.portargprogr.security.entity.Rol;
import com.portfolio.portargprogr.security.enums.RolNombre;
import com.portfolio.portargprogr.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
   
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    } 
}
