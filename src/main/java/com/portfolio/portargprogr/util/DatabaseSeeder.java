package com.portfolio.portargprogr.util;


import com.portfolio.portargprogr.security.entity.Usuario;
import com.portfolio.portargprogr.security.entity.UsuarioPrincipal;
import com.portfolio.portargprogr.security.service.UserDetailsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.portfolio.portargprogr.security.service.RolService;


import com.portfolio.portargprogr.dto.Mensaje;
import com.portfolio.portargprogr.security.dto.JwtDto;
import com.portfolio.portargprogr.security.dto.LoginUsuario;
import com.portfolio.portargprogr.security.dto.NuevoUsuario;
import com.portfolio.portargprogr.security.entity.Rol;
import com.portfolio.portargprogr.security.enums.RolNombre;
import com.portfolio.portargprogr.security.jwt.JwtProvider;
import com.portfolio.portargprogr.security.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

/**
 * MUY IMPORTANTE: ESTA CLASE SÓLO SE EJECUTARÁ UNA VEZ PARA CREAR UN ADMIN
 * UNA VEZ CREADOS SE DEBERÁ ELIMINAR O BIEN COMENTAR EL CÓDIGO
 *
 */

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    RolService rolService;

    @Autowired
    UsuarioService usuarioService;

    @Override
    public void run(String... args) throws Exception {
        // /*
        //DESCOMENTAR SI SE QUIERE HACER UN SEED A LA DB
        // Creo un Rol
        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        rolService.save(rolAdmin);

        // Creo un Usuario
        Usuario usuario = new Usuario("ariel", "ariel", "amunoz@vieyraweb.com.ar",
        passwordEncoder.encode("aMunoz1"));

        Set<Rol> roles = new HashSet<>();

        roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        usuario.setRoles(roles);
        usuarioService.save(usuario);
        // */
    }
}
