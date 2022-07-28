package com.portfolio.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EExperiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exp;
    
    private String empresa;
    private String cargo;
    private String periodo;
    private String descripcion;
    private String logo_empresa;
}
