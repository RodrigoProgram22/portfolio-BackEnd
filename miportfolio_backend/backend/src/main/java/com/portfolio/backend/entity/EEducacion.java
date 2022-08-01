
package com.portfolio.backend.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EEducacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_edu;
    
    private String nombre_inst;
    private String titulo;
    private String fecha; 
    private String enlace;
    private String logo_inst;
}
