package com.portfolio.backend.security.controller;

import com.portfolio.backend.dto.Mensaje;
import com.portfolio.backend.security.dto.JwtDto;
import com.portfolio.backend.security.dto.LoginUsuario;
import com.portfolio.backend.security.dto.NuevoUsuario;
import com.portfolio.backend.security.entity.Rol;
import com.portfolio.backend.security.entity.Usuario;
import com.portfolio.backend.security.enums.RolNombre;
import com.portfolio.backend.security.jwt.JwtProvider;
import com.portfolio.backend.security.service.RolService;
import com.portfolio.backend.security.service.UsuarioService;
import java.util.HashSet;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;
    
    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;
    
    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUser, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("Campos vacios"), HttpStatus.BAD_REQUEST);
        if(usuarioService.existsByNombreUsuario(nuevoUser.getNombreUsuario()))
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"),HttpStatus.BAD_REQUEST);
        if(usuarioService.existsByEmail(nuevoUser.getEmail()))
            return new ResponseEntity(new Mensaje("Ese email ya existe"),HttpStatus.BAD_REQUEST);
        Usuario usuario = new Usuario(nuevoUser.getNombre(),nuevoUser.getNombreUsuario(),nuevoUser.getEmail(),
                passwordEncoder.encode(nuevoUser.getPassword()));
        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
        if(nuevoUser.getRoles().contains("admin"))
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        usuario.setRoles(roles);
        usuarioService.save(usuario);
        return new ResponseEntity(new Mensaje("Usuario guardado"),HttpStatus.CREATED);
    }
    
    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUsuario loginUsuario,BindingResult b){
       if(b.hasErrors())
           return new ResponseEntity(new Mensaje("Campos vacios. Vuelve a intentarlo."),HttpStatus.BAD_REQUEST);
       Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(),loginUsuario.getPassword()));
       SecurityContextHolder.getContext().setAuthentication(authentication);
       String jwt = jwtProvider.generateToken(authentication);
       UserDetails userDetails = (UserDetails)authentication.getPrincipal();
       JwtDto jwtDto = new JwtDto(jwt,userDetails.getUsername(),userDetails.getAuthorities());
       return new ResponseEntity(jwtDto,HttpStatus.OK);
    }
}
