package com.portfolio.backend.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EAcerca_de {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_acerca_de;
    
    
    private String nombre_apellido;
    private String titulo;
    private String email;
    private String descripcion;
    private String img_perfil;
}
