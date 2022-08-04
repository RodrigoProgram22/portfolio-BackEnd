
package com.portfolio.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class EProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proyec;
    
    private String titulo;
    private String enlace;
    private String fecha;
    private String descripcion;
    private String img_proyec;
}
