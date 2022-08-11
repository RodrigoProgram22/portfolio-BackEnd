package com.portfolio.backend.security.entity;

import com.portfolio.backend.security.enums.RolNombre;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;
    public Rol(){}

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
}
